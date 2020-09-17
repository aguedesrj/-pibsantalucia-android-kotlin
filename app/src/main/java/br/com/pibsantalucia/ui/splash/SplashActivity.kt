package br.com.pibsantalucia.ui.splash

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.opengl.Visibility
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProviders
import br.com.pibsantalucia.MainActivity
import br.com.pibsantalucia.PibSantaLuciaApplication
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.User
import br.com.pibsantalucia.ui.base.BaseActivity
import br.com.pibsantalucia.ui.changepassword.ChangePasswordActivity
import br.com.pibsantalucia.ui.login.LoginActivity
import br.com.pibsantalucia.ui.login.LoginViewModel
import com.android.tools.build.jetifier.core.utils.Log
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity: BaseActivity(), ISplashActivity {

    private lateinit var model: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        progressBarSplash.hide()

        this.delay()
    }

    private fun delay() {
        Handler().postDelayed({

            var user: User? = PibSantaLuciaApplication.database?.userDao()?.getUser()
            if (user == null) {
                // Login
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            } else {
                progressBarSplash.show()

                // chama o serviço de login
                model.login(user.cpfOrEmail, user.umeSenha)
            }

        }, 1000)
    }

    override fun success(user: User) {
        // salvar dados local
        PibSantaLuciaApplication.database?.userDao()?.insertUser(user)

        var intentMain = Intent(this@SplashActivity, MainActivity::class.java)
        if (intent.hasExtra("pesCodigo")) {
            var pesCodigoPush: String = intent.extras?.get("pesCodigo").toString()
            intentMain.putExtra("pesCodigoPush", pesCodigoPush)
        }
        startActivity(intentMain)
        finish()
    }

    override fun fail(message: String) {
        // Login
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }

    override fun onStart() {
        super.onStart()

        model = ViewModelProviders.of(this).get(SplashViewModel::class.java)
        model.view = this
    }
}
