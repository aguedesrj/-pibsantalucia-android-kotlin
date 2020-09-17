package br.com.pibsantalucia.ui.forgotpassword

import android.app.AlertDialog
import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProviders
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.User
import br.com.pibsantalucia.ui.base.BaseActivity
import br.com.pibsantalucia.ui.login.LoginViewModel
import br.com.pibsantalucia.utils.hideSoftKeyBoard
import kotlinx.android.synthetic.main.activity_forgot_password.*

class ForgotPasswordActivity: BaseActivity(), IForgotPasswordActivity {

    private lateinit var model: ForgotPasswordViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        imageButtonForgotPasswordBack.setOnClickListener(View.OnClickListener {
            this.onBackPressed()
        })

        buttonForgotPasswordSend.setOnClickListener(View.OnClickListener {

            hideSoftKeyBoard(textInputEditTextForgotPasswordEmail)

            this.loading()
            model.forgotPassword(textInputEditTextForgotPasswordEmail.text.toString())
        })

        textInputEditTextForgotPasswordEmail.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            @RequiresApi(Build.VERSION_CODES.M)
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                textInputLayoutForgotPasswordEmail.error = null
            }
            override fun afterTextChanged(editable: Editable) {}
        })
    }

    override fun showErrorCpfOrEmail(message: Int) {
        hideLoading()
        textInputLayoutForgotPasswordEmail.error = getString(message)
    }

    override fun success(message: String) {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage(message)
        alertDialogBuilder.setTitle("")
        alertDialogBuilder
            .setCancelable(false)
            .setNegativeButton(resources.getString(R.string.dialog_neutral_button)) { dialog, id ->
                this.onBackPressed()
            }
        val alertD = alertDialogBuilder.create()
        alertD.show()
    }

    override fun fail(message: String) {
        this.showMessage(message)
    }

    override fun onStart() {
        super.onStart()

        model = ViewModelProviders.of(this).get(ForgotPasswordViewModel::class.java)
        model.view = this
    }
}
