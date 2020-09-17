package br.com.pibsantalucia.ui.obito

import android.app.AlertDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import android.view.MenuItem
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProviders
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.*
import br.com.pibsantalucia.ui.base.BaseActivity
import br.com.pibsantalucia.ui.reconciliacao.ReconciliacaoViewModel
import br.com.pibsantalucia.utils.hideSoftKeyBoard
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_obito.*
import kotlinx.android.synthetic.main.activity_reconciliacao.*
import kotlinx.android.synthetic.main.data_personal_fragment.*
import java.util.ArrayList

class ObitoActivity: BaseActivity(), IObitoActivity {

    private lateinit var model: ObitoViewModel
    private lateinit var person: ListPeople

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obito)

        val actionbar = supportActionBar
        actionbar!!.title = "Óbito"
        actionbar.setDisplayHomeAsUpEnabled(true)

        person = this.intent.extras!!.getSerializable("person") as ListPeople

        textViewNameObito.setText(person.pesNome)
        Picasso.get()
            .load(person.pesFotoPath)
            .placeholder(R.drawable.ic_placeholder_user)
            .error(R.drawable.ic_placeholder_user)
            .into(circularImageViewPhotoObito)

        editTextObitoDate.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            @RequiresApi(Build.VERSION_CODES.M)
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                textInputLayoutObitoDate.error = null
            }
            override fun afterTextChanged(editable: Editable) {}
        })
    }

    override fun onStart() {
        super.onStart()

        model = ViewModelProviders.of(this).get(ObitoViewModel::class.java)
        model.view = this
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_save, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.action_save) {
            // salvar
            save()
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun save() {
        try {
            hideSoftKeyBoard(this, editTextObitoDate)

            var obito: Obito = Obito()
            obito.pesCodigo = person.pesCodigo
            obito.obiDtObito = editTextObitoDate.text.toString()
            obito.obiCausa = textInputEditTextObitoCausa.text.toString().trim()
            obito.obiObservacao = textInputEditTextObitoObs.text.toString().trim()

            // salvar
            model.save(obito)
        } catch (e: Exception) {
            this.hideLoading()
            this.showMessage(getString(R.string.error_message_system_not_available))
        }
    }

    override fun showErrorData(message: Int) {
        this.hideLoading()
        textInputLayoutObitoDate.error = getString(message)
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
