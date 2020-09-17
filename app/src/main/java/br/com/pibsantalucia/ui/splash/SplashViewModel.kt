package br.com.pibsantalucia.ui.splash

import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.R
import br.com.pibsantalucia.repository.LoginRepository
import br.com.pibsantalucia.ui.changepassword.IChangePasswordActivity
import br.com.pibsantalucia.ui.login.LoginActivity
import br.com.pibsantalucia.utils.isValidEmail
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class SplashViewModel: ViewModel() {

    private val loginRepository: LoginRepository
    lateinit var view: ISplashActivity

    init {
        loginRepository = LoginRepository()
    }

    fun login(cpfOrEmail: String, password: String) {

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