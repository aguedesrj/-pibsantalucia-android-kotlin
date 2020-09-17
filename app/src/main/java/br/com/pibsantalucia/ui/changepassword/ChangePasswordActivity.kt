package br.com.pibsantalucia.ui.changepassword

import android.app.AlertDialog
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProviders
import br.com.pibsantalucia.MainActivity
import br.com.pibsantalucia.PibSantaLuciaApplication
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.User
import br.com.pibsantalucia.ui.base.BaseActivity
import br.com.pibsantalucia.ui.register.RegisterViewModel
import br.com.pibsantalucia.utils.hideSoftKeyBoard
import com.facebook.stetho.common.Util
import kotlinx.android.synthetic.main.activity_change_password.*
import kotlinx.android.synthetic.main.activity_forgot_password.*
import kotlinx.android.synthetic.main.activity_register.*

class ChangePasswordActivity: BaseActivity(), IChangePasswordActivity {

    private lateinit var model: ChangePasswordViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_password)

        imageButtonChangePasswordBack.setOnClickListener(View.OnClickListener {
            this.onBackPressed()
        })

        buttonChangePasswordSend.setOnClickListener(View.OnClickListener {
            hideSoftKeyBoard(this@ChangePasswordActivity, textInputEditTextChangePasswordConfirmation)

            this.loading()

            model.changePassword(intent.getStringExtra("cpfOrEmail"),
                textInputEditTextChangePassword.text.toString(),
                textInputEditTextChangePasswordConfirmation.text.toString())
        })

        textInputEditTextChangePassword.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            @RequiresApi(Build.VERSION_CODES.M)
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                textInputLayoutChangePassword.error = null
            }
            override fun afterTextChanged(editable: Editable) {}
        })

        textInputEditTextChangePasswordConfirmation.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            @RequiresApi(Build.VERSION_CODES.M)
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                textInputLayoutChangePasswordConfirmation.error = null
            }
            override fun afterTextChanged(editable: Editable) {}
        })
    }

    override fun onStart() {
        super.onStart()

        model = ViewModelProviders.of(this).get(ChangePasswordViewModel::class.java)
        model.view = this
    }

    override fun showErrorNewPassword(message: Int) {
        this.hideLoading()
        textInputLayoutChangePassword.error = getString(message)
    }

    override fun showErrorNewPasswordConfirmation(message: Int) {
        this.hideLoading()
        textInputLayoutChangePasswordConfirmation.error = getString(message)
    }

    override fun success(message: String, user: User) {
        this.hideLoading()

        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage(message)
        alertDialogBuilder.setTitle("")
        alertDialogBuilder
            .setCancelable(false)
            .setNegativeButton(resources.getString(R.string.dialog_neutral_button)) { dialog, id ->
                // ir para tela da Home

                // salvar dados local
                PibSantaLuciaApplication.database?.userDao()?.insertUser(user)

                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        val alertD = alertDialogBuilder.create()
        alertD.show()
    }

    override fun fail(message: String) {
        this.showMessage(message)
    }
}
