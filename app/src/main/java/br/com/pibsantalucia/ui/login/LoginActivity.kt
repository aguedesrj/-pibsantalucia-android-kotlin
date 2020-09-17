package br.com.pibsantalucia.ui.login

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import br.com.pibsantalucia.MainActivity
import br.com.pibsantalucia.PibSantaLuciaApplication
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.User
import br.com.pibsantalucia.ui.base.BaseActivity
import br.com.pibsantalucia.ui.changepassword.ChangePasswordActivity
import br.com.pibsantalucia.ui.forgotpassword.ForgotPasswordActivity
import br.com.pibsantalucia.ui.register.RegisterActivity
import br.com.pibsantalucia.utils.hideSoftKeyBoard
import kotlinx.android.synthetic.main.activity_change_password.*
import kotlinx.android.synthetic.main.activity_forgot_password.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*

class LoginActivity: BaseActivity(), ILoginActivity {

    private lateinit var model: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        buttonLogin.setOnClickListener(View.OnClickListener {

            hideSoftKeyBoard(textInputEditTextPassword)

            this.loading()
            model.login(textInputEditTextLoginCpfEmail.text.toString(), textInputEditTextPassword.text.toString())
        })

        buttonForgotPassword.setOnClickListener(View.OnClickListener {
            textInputEditTextLoginCpfEmail.setText("")
            textInputEditTextPassword.setText("")

            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        })

        buttonRegister.setOnClickListener(View.OnClickListener {
            textInputEditTextLoginCpfEmail.setText("")
            textInputEditTextPassword.setText("")

            startActivity(Intent(this, RegisterActivity::class.java))
        })

        textInputEditTextLoginCpfEmail.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            @RequiresApi(Build.VERSION_CODES.M)
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                textInputLayoutLoginEmail.error = null
            }
            override fun afterTextChanged(editable: Editable) {}
        })

        textInputEditTextPassword.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            @RequiresApi(Build.VERSION_CODES.M)
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                textInputLayoutLoginPassword.error = null
            }
            override fun afterTextChanged(editable: Editable) {}
        })
    }

    override fun onStart() {
        super.onStart()

        model = ViewModelProviders.of(this).get(LoginViewModel::class.java)
        model.view = this
    }

    override fun success(user: User) {
        this.hideLoading()

        // verifica se é necessário alterar a senha
        if (user.umeSenhaTemp) {
            var intent: Intent = Intent(this, ChangePasswordActivity::class.java)
            intent.putExtra("cpfOrEmail", textInputEditTextLoginCpfEmail.text.toString())

            // exibir a tela de trovar senha
            startActivity(intent)
            return
        }

        // salvar dados local
        PibSantaLuciaApplication.database?.userDao()?.insertUser(user)

        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    override fun fail(message: String) {
        this.showMessage(message)
    }

    override fun showErrorEmail(message: Int) {
        this.hideLoading()
        textInputLayoutLoginEmail.error = getString(message)
    }

    override fun showErrorPassword(message: Int) {
        this.hideLoading()
        textInputLayoutLoginPassword.error = getString(message)
    }
}