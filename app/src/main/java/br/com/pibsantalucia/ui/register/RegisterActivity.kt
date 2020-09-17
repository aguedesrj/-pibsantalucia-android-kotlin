package br.com.pibsantalucia.ui.register

import android.app.AlertDialog
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProviders
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.User
import br.com.pibsantalucia.ui.base.BaseActivity
import br.com.pibsantalucia.utils.hideSoftKeyBoard
import kotlinx.android.synthetic.main.activity_change_password.*
import kotlinx.android.synthetic.main.activity_forgot_password.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity: BaseActivity(), IRegisterActivity {

    private lateinit var model: RegisterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        imageButtonRegisterBack.setOnClickListener(View.OnClickListener {
            this.onBackPressed()
        })

        buttonRegisterSend.setOnClickListener(View.OnClickListener {
            hideSoftKeyBoard(this@RegisterActivity, textInputEditTextRegisterCpfEmail)

            this.loading()
            model.register(textInputEditTextRegisterCpfEmail.text.toString())
        })

        textInputEditTextRegisterCpfEmail.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            @RequiresApi(Build.VERSION_CODES.M)
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                textInputLayoutRegisterEmail.error = null
            }
            override fun afterTextChanged(editable: Editable) {}
        })
    }

    override fun onStart() {
        super.onStart()

        model = ViewModelProviders.of(this).get(RegisterViewModel::class.java)
        model.view = this
    }

    override fun showErrorCpfOrEmail(message: Int) {
        this.hideLoading()
        textInputLayoutRegisterEmail.error = getString(message)
    }

    override fun success(message: String) {
        this.hideLoading()

        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage(message)
        alertDialogBuilder.setTitle("")
        alertDialogBuilder
            .setCancelable(false)
            .setNegativeButton(resources.getString(R.string.dialog_neutral_button)) { dialog, id ->
                // voltar a tela de login
                this.onBackPressed()
            }
        val alertD = alertDialogBuilder.create()
        alertD.show()
    }

    override fun fail(message: String) {
        this.showMessage(message)
    }
}
