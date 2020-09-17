package br.com.pibsantalucia

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.widget.Toolbar
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProviders
import br.com.pibsantalucia.model.DeviceMobile
import br.com.pibsantalucia.model.Person
import br.com.pibsantalucia.model.User
import br.com.pibsantalucia.ui.escala.TipoEscala
import br.com.pibsantalucia.ui.aniversariantes.AniversarientesFragment
import br.com.pibsantalucia.ui.anuncio.AnuncioFragment
import br.com.pibsantalucia.ui.base.BaseActivity
import br.com.pibsantalucia.ui.detalhefullmembro.DetalheFullMembroActivity
import br.com.pibsantalucia.ui.detalhemembro.DetalheMembroActivity
import br.com.pibsantalucia.ui.escala.EscalaFragment
import br.com.pibsantalucia.ui.listpessoa.ListPessoaFragment
import br.com.pibsantalucia.ui.login.LoginActivity
import br.com.pibsantalucia.ui.membros.MembrosFragment
import br.com.pibsantalucia.ui.pastoral.PastoralFragment
import br.com.pibsantalucia.utils.hideSoftKeyBoard
import br.com.pibsantalucia.utils.isPerfilSecretaria
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.iid.FirebaseInstanceId
import com.mikhaellopez.circularimageview.CircularImageView
import com.squareup.picasso.Picasso
import kotlin.properties.Delegates

class MainActivity : BaseActivity(), IMainActivity, DrawerLayout.DrawerListener  {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var aToggle: ActionBarDrawerToggle

    private var checkedItemMenu: Int = 0
    private lateinit var model: MainViewModel
    private var user: User by Delegates.notNull()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        navView.menu.clear()
        user = PibSantaLuciaApplication.database?.userDao()?.getUser()!!
        if (!isPerfilSecretaria()) {
            navView.inflateMenu(R.menu.activity_main_drawer_membro)
        } else {
            navView.inflateMenu(R.menu.activity_main_drawer)
        }

        aToggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close)
        drawerLayout.addDrawerListener(aToggle)
        aToggle.syncState()

        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_pastoral -> {
                    checkedItemMenu = R.id.nav_pastoral
                    toolbar.title = getString(R.string.menu_pastoral)
                    navigateToFragment(PastoralFragment.newInstance())
                }
                R.id.nav_register_membros -> {
                    checkedItemMenu = R.id.nav_register_membros
                    toolbar.title = getString(R.string.menu_register_membros)
                    navigateToFragment(ListPessoaFragment.newInstance())
                }
                R.id.nav_list_membros -> {
                    checkedItemMenu = R.id.nav_list_membros
                    toolbar.title = getString(R.string.menu_list_membros)
                    navigateToFragment(MembrosFragment.newInstance())
                }
                R.id.nav_list_aniversariantes -> {
                    checkedItemMenu = R.id.nav_list_aniversariantes
                    toolbar.title = getString(R.string.menu_list_birthdays)
                    navigateToFragment(AniversarientesFragment.newInstance())
                }
                R.id.nav_escala_datashow -> {
                    checkedItemMenu = R.id.nav_escala_datashow
                    toolbar.title = getString(R.string.menu_escala_datashow)
                    navigateToFragment(showEscalaFragment(TipoEscala.DATASHOW))
                }
                R.id.nav_escala_musica -> {
                    checkedItemMenu = R.id.nav_escala_musica
                    toolbar.title = getString(R.string.menu_escala_musica)
                    navigateToFragment(showEscalaFragment(TipoEscala.MUSICA))
                }
                R.id.nav_escala_portaria -> {
                    checkedItemMenu = R.id.nav_escala_portaria
                    toolbar.title = getString(R.string.menu_escala_portaria)
                    navigateToFragment(showEscalaFragment(TipoEscala.PORTARIA))
                }
                R.id.nav_escala_som -> {
                    checkedItemMenu = R.id.nav_escala_som
                    toolbar.title = getString(R.string.menu_escala_som)
                    navigateToFragment(showEscalaFragment(TipoEscala.SOM))
                }
                R.id.nav_anuncio -> {
                    checkedItemMenu = R.id.nav_anuncio
                    toolbar.title = getString(R.string.menu_anuncio)
                    navigateToFragment(AnuncioFragment.newInstance())
                }
            }
            menuItem.isChecked = true
            drawerLayout.closeDrawers()

            true
        }

        drawerLayout.addDrawerListener(this)

        var header: View = navView.getHeaderView(0)
        val textViewMenuName = header.findViewById<TextView>(R.id.textViewMenuName)
        val textViewMenuEmail = header.findViewById<TextView>(R.id.textViewMenuEmail)
        val imageViewMenuPhoto = header.findViewById<CircularImageView>(R.id.imageViewMenuPhoto)
        val imageButtonMenuSair = header.findViewById<ImageButton>(R.id.imageButtonMenuSair)

        textViewMenuName.text = user.pesNome
        textViewMenuEmail.text = user.cpfOrEmail
        if (user.urlPhoto != null) {
            Picasso.get()
                .load(user.urlPhoto)
                .placeholder(R.drawable.ic_placeholder_user)
                .error(R.drawable.ic_placeholder_user)
                .into(imageViewMenuPhoto);
        }

        checkedItemMenu = R.id.nav_pastoral
        navView.setCheckedItem(R.id.nav_pastoral)
        toolbar.title = getString(R.string.menu_pastoral)
        navigateToFragment(PastoralFragment.newInstance())

        model = ViewModelProviders.of(this).get(MainViewModel::class.java)
        model.view = this

        if (this.intent.hasExtra("pesCodigoPush")) {
            val pesCodigoPush: String = this.intent.getStringExtra("pesCodigoPush")
            model.getPerson(pesCodigoPush.toLong())
        }

        imageButtonMenuSair.setOnClickListener(View.OnClickListener {
            val alertDialogBuilder = AlertDialog.Builder(this)
            alertDialogBuilder.setMessage("Deseja realmente sair do aplicativo?")
            alertDialogBuilder.setTitle("Sair do Aplicativo")
            alertDialogBuilder
                .setCancelable(false)
                .setPositiveButton(resources.getString(R.string.dialog_button_yes)) { dialog, id ->
                    // limpar a base local
                    PibSantaLuciaApplication.database?.userDao()?.deleteUser()

                    // ir pra tela do Login
                    startActivity(Intent(this, LoginActivity::class.java))
                    finish()
                }
                .setNegativeButton(resources.getString(R.string.dialog_button_no)) { dialog, id ->
                    // default
                    navView.setCheckedItem(checkedItemMenu)
                }

            val alertD = alertDialogBuilder.create()
            alertD.show()
        })

        updateToken()
    }

    private fun showEscalaFragment(tipoEscala: TipoEscala): EscalaFragment {
        var fragment: EscalaFragment = EscalaFragment.newInstance()
        fragment.tipoEscala = tipoEscala

        return fragment
    }

    private fun updateToken() {
        FirebaseInstanceId.getInstance().instanceId.addOnSuccessListener { instanceIdResult ->

            var deviceMobile: DeviceMobile = DeviceMobile()
            deviceMobile.demId = Settings.Secure.getString(applicationContext.contentResolver, Settings.Secure.ANDROID_ID)
            deviceMobile.demOs = "ANDROID"
            deviceMobile.demVersao = android.os.Build.VERSION.RELEASE
            deviceMobile.demTokenFirebase = instanceIdResult.token
            deviceMobile.pesCodigo = user.pesCodigo

            model.saveDeviceMobile(deviceMobile)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private fun navigateToFragment(fragmentToNavigate: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.nav_host_fragment, fragmentToNavigate)
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        fragmentTransaction.commit()
    }

    override fun success(person: Person) {
        this.hideLoading()

        var user: User = PibSantaLuciaApplication.database?.userDao()?.getUser()!!

        val extras = Bundle()
        extras.putSerializable("person", person)

        if (person.pesCodigo != user.pesCodigo) {
            var intent = Intent(this, DetalheMembroActivity::class.java)
            intent.putExtras(extras)

            startActivity(intent)
        } else {
            var intent = Intent(this, DetalheFullMembroActivity::class.java)
            intent.putExtras(extras)

            startActivity(intent)
        }
    }

    override fun fail(message: String) {
        this.showMessage(message)
    }

    override fun onDrawerStateChanged(newState: Int) {
        val view = this.currentFocus
        if (view != null) {
            hideSoftKeyBoard(view)
        }
    }

    override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
        //
    }

    override fun onDrawerClosed(drawerView: View) {
        //
    }

    override fun onDrawerOpened(drawerView: View) {
        //
    }
}
