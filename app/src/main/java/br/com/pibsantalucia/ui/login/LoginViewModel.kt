package br.com.pibsantalucia.ui.login

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import br.com.pibsantalucia.R
import br.com.pibsantalucia.repository.LoginRepository
import br.com.pibsantalucia.ui.base.BaseViewModel
import br.com.pibsantalucia.utils.isValidEmail
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class LoginViewModel: ViewModel() {

    private var loginRepository: LoginRepository
    lateinit var view: ILoginActivity

    init {
        loginRepository = LoginRepository()
    }

    fun login(cpfOrEmail: String, password: String) {

        var isValid: Boolean = true

        if (cpfOrEmail.isEmpty()) {
            view.showErrorEmail(R.string.msg_error_empty)
            isValid = false
        }

        if (password.isEmpty()) {
            view.showErrorPassword(R.string.msg_error_empty)
            isValid = false
        }

        if (isValid) {
            loginRepository.login(cpfOrEmail, password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ result ->
                    result.cpfOrEmail = cpfOrEmail
                    result.umeSenha = password
                    view.success(result)
                },
                    { throwable ->
                        view.fail(throwable.message!!)
                    }
                )
        }
    }
}