package br.com.pibsantalucia.ui.registerpessoa

import android.Manifest
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.core.app.ActivityCompat
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProviders
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Person
import br.com.pibsantalucia.model.TypeContact
import br.com.pibsantalucia.ui.base.BaseActivity
import br.com.pibsantalucia.ui.registerpessoa.fragment.AddressFragment
import br.com.pibsantalucia.ui.registerpessoa.fragment.ContactsFragment
import br.com.pibsantalucia.ui.registerpessoa.fragment.DataPersonalFragment
import br.com.pibsantalucia.ui.registerpessoa.fragment.MoreInformationFragment
import br.com.pibsantalucia.utils.firebaseAnalyticsEvents
import br.com.pibsantalucia.utils.hideSoftKeyBoard
import br.com.pibsantalucia.utils.resizedBitmap
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.theartofdev.edmodo.cropper.CropImage
import com.theartofdev.edmodo.cropper.CropImageOptions
import com.theartofdev.edmodo.cropper.CropImageView
import org.antlr.v4.misc.Utils
import java.util.*

class RegisterPessoaActivity: BaseActivity(), IRegisterPessoaActivity {

    private var dataPersonalFragment: DataPersonalFragment = DataPersonalFragment()
    private var moreInformationFragment: MoreInformationFragment = MoreInformationFragment()
    private var addressFragment: AddressFragment = AddressFragment()
    private var contactsFragment: ContactsFragment = ContactsFragment()
    private lateinit var fm: FragmentManager
    private lateinit var navigation: BottomNavigationView
    private lateinit var activeFragment: Fragment

    private lateinit var model: RegisterPessoaViewModel
    var listTypeContact: ArrayList<TypeContact>? = null
    var person: Person? = null
    var mCropImageUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_pessoa)

        var bundle: Bundle? = this.intent.extras
        listTypeContact = bundle!!.getSerializable("listTypeContact") as ArrayList<TypeContact>?
        if (bundle!!.getSerializable("person") != null) {
            person = bundle!!.getSerializable("person") as Person
        }

        if (person == null) {
            person = Person()
        }

        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Cadastro"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)

        fm = supportFragmentManager
        dataPersonalFragment.person = person!!

        moreInformationFragment.person = person!!

        addressFragment.person = person!!

        contactsFragment.person = person!!
        contactsFragment.listTypeContacts = listTypeContact!!

        fm.beginTransaction().add(R.id.constraintLayoutFragments, contactsFragment, "4").hide(contactsFragment).commit()
        fm.beginTransaction().add(R.id.constraintLayoutFragments, addressFragment, "3").hide(addressFragment).commit()
        fm.beginTransaction().add(R.id.constraintLayoutFragments, moreInformationFragment, "2").hide(moreInformationFragment).commit()
        fm.beginTransaction().add(R.id.constraintLayoutFragments, dataPersonalFragment, "1").commit()

        // default
        activeFragment = dataPersonalFragment

        navigation = findViewById(R.id.navigation)
        navigation.setOnNavigationItemSelectedListener{ item ->
            hideSoftKeyBoard(this, activeFragment.view!!)
            when(item.itemId) {
                R.id.navigation_data_personal -> {
                    fm.beginTransaction().hide(activeFragment).show(dataPersonalFragment).commit()
                    activeFragment = dataPersonalFragment
                }

                R.id.navigation_more_information -> {
                    fm.beginTransaction().hide(activeFragment).show(moreInformationFragment).commit()
                    activeFragment = moreInformationFragment
                }

                R.id.navigation_address -> {
                    fm.beginTransaction().hide(activeFragment).show(addressFragment).commit()
                    activeFragment = addressFragment
                }

                R.id.navigation_contacts -> {
                    fm.beginTransaction().hide(activeFragment).show(contactsFragment).commit()
                    activeFragment = contactsFragment
                }
            }
            return@setOnNavigationItemSelectedListener true
        }

        firebaseAnalyticsEvents(this, "RegistroMembro", "Cadastro")
    }

    override fun onStart() {
        super.onStart()

        model = ViewModelProviders.of(this).get(RegisterPessoaViewModel::class.java)
        model.view = this
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_save, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.action_save) {
            // salvar congregado
            saveCongregado()
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun saveCongregado() {
        try {
            hideSoftKeyBoard(this, activeFragment.view!!)

            val isValidationDataPersonalFragment = dataPersonalFragment.validateFields()
            val isValidationMoreInformationFragment = moreInformationFragment.validateFields()
            // validar campos das abas "Dados Pessoais" e "Mais informações"
            if (!isValidationDataPersonalFragment || !isValidationMoreInformationFragment) {
                if (!isValidationDataPersonalFragment) {
                    fm.beginTransaction().hide(activeFragment!!).show(dataPersonalFragment).commit()
                    activeFragment = dataPersonalFragment
                    navigation.menu.getItem(0)
                } else {
                    fm.beginTransaction().hide(activeFragment!!).show(moreInformationFragment).commit()
                    activeFragment = moreInformationFragment
                    navigation.menu.getItem(1)
                }
                return
            }

            this.loading("Salvando...")

            // salvar
            person = dataPersonalFragment.assignValuesToPerson()
            person = moreInformationFragment.assignValuesToPerson()
            person = addressFragment.assignValuesToPerson()
            person = contactsFragment.assignValuesToPerson()

            model.save(this.person!!)
        } catch (e: Exception) {
            this.hideLoading()
            this.showMessage(getString(R.string.error_message_system_not_available))
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == CropImage.PICK_IMAGE_CHOOSER_REQUEST_CODE
            && resultCode == RESULT_OK
        ) {
            val imageUri = CropImage.getPickImageResultUri(this, data)
            if (CropImage.isReadExternalStoragePermissionsRequired(this, imageUri)) {
                mCropImageUri = imageUri
                ActivityCompat.requestPermissions(
                    this, arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),
                    CropImage.PICK_IMAGE_PERMISSIONS_REQUEST_CODE
                )
            } else {

                CropImage.activity(imageUri)
                    .setGuidelines(CropImageView.Guidelines.ON)
                    .setCropShape(CropImageView.CropShape.OVAL)
                    .setCropMenuCropButtonTitle("  OK  ")
                    .setFixAspectRatio(true)
                    .setAspectRatio(3, 3)
                    .start(this)
            }
        } else if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            val result = CropImage.getActivityResult(data)
            if (resultCode == RESULT_OK) {
                try {
                    val resultUri = result.uri
                    val bitmap =
                        MediaStore.Images.Media.getBitmap(this.contentResolver, resultUri)
                    val bitmapResult: Bitmap = resizedBitmap(bitmap)
                    dataPersonalFragment.setPhotoCropImageView(bitmapResult)
                } catch (e: java.lang.Exception) {
                    this.showMessage(getString(R.string.error_message_photo))
                }
            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                this.showMessage(getString(R.string.error_message_photo))
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String?>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == CropImage.CAMERA_CAPTURE_PERMISSIONS_REQUEST_CODE) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                CropImage.startPickImageActivity(this)
            } else {
                this.showMessage(getString(R.string.error_message_not_permission_camera))
            }
        }
        if (requestCode == CropImage.PICK_IMAGE_PERMISSIONS_REQUEST_CODE) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                val mOptions = CropImageOptions()
                mOptions.fixAspectRatio = true
                mOptions.outputCompressFormat = Bitmap.CompressFormat.PNG
                mOptions.autoZoomEnabled = false
                mOptions.backgroundColor = R.color.colorAccent

                val intent = Intent(this, PhotoActivity::class.java)
                intent.putExtra("mCropImageUri", mCropImageUri)
                intent.putExtra("mOptions", mOptions)
                startActivityForResult(intent, CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE)
            } else {
                this.showMessage(getString(R.string.error_message_not_permission_photos))
            }
        }
    }

    override fun success(message: String) {
        this.hideLoading()

        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage(message)
        alertDialogBuilder.setTitle("")
        alertDialogBuilder
            .setCancelable(false)
            .setNegativeButton(resources.getString(R.string.dialog_neutral_button)) { dialog, _ ->
                finish()
            }

        val alertD = alertDialogBuilder.create()
        alertD.show()
    }

    override fun fail(message: String) {
        this.showMessage(message)
    }
}
