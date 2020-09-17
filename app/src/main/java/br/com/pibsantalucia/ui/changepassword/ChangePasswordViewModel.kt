package br.com.pibsantalucia.ui.changepassword

import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.R
import br.com.pibsantalucia.repository.LoginRepository
import br.com.pibsantalucia.ui.login.ILoginActivity
import br.com.pibsantalucia.ui.register.RegisterActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ChangePasswordViewModel: ViewModel() {

    private val repository: LoginRepository
    lateinit var view: IChangePasswordActivity

    init {
        repository = LoginRepository()
    }

    fun changePassword(cpfOrEmail: String, passwordNew: String, passwordNewConfirmation: String) {

        var isValid: Boolean = true

        if (passwordNew.isEmpty()) {
            view.showErrorNewPassword(R.string.msg_error_empty)
            isValid = false
        }

        if (passwordNewConfirmation.isEmpty()) {
            view.showErrorNewPasswordConfirmation(R.string.msg_error_empty)
            isValid = false
        }

        if (passwordNew.length <= 5) {
            view.showErrorNewPassword(R.string.msg_error_invalid_password)
            isValid = false
        }

        if (!passwordNew.equals(passwordNewConfirmation)) {
            view.showErrorNewPasswordConfirmation(R.string.msg_error_password_confirmation)
            isValid = false
        }

        if (isValid) {

            // chama o serviço
            repository.changePassword(cpfOrEmail, passwordNew, passwordNewConfirmation)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ result ->
                    result.data!!.cpfOrEmail = cpfOrEmail
                    result.data!!.umeSenha = passwordNew
                    view.success(result.message!!, result.data!!)
                },
                    { throwable ->
                        view.fail(throwable.message!!)
                    }
                )
        }
    }
}