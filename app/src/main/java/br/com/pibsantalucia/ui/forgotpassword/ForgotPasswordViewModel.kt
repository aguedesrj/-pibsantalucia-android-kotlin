package br.com.pibsantalucia.ui.forgotpassword

import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.R
import br.com.pibsantalucia.repository.LoginRepository
import br.com.pibsantalucia.ui.changepassword.IChangePasswordActivity
import br.com.pibsantalucia.ui.login.LoginActivity
import br.com.pibsantalucia.utils.isValidEmail
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ForgotPasswordViewModel: ViewModel() {

    val repository: LoginRepository
    lateinit var view: IForgotPasswordActivity

    init {
        repository = LoginRepository()
    }

    fun forgotPassword(cpfOrEmail : String) {

        if (cpfOrEmail.isEmpty()) {
            view.showErrorCpfOrEmail(R.string.msg_error_empty)
            return
        } else if (!cpfOrEmail.isValidEmail()) {
            view.showErrorCpfOrEmail(R.string.msg_error_invalid_mail)
            return
        }

        // chama o serviço
        repository.forgotPassword(cpfOrEmail)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ resul ->
                view.success(resul)
            },
                { throwable ->
                    view.fail(throwable.message!!)
                }
            )
    }
}