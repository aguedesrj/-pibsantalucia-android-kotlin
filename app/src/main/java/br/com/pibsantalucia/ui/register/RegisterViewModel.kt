package br.com.pibsantalucia.ui.register

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.R
import br.com.pibsantalucia.repository.LoginRepository
import br.com.pibsantalucia.utils.isValidEmail
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class RegisterViewModel: ViewModel() {

    var repository: LoginRepository
    lateinit var view: IRegisterActivity

    init {
        repository = LoginRepository()
        view = RegisterActivity()
    }

    fun register(cpfOrEmail: String) {

        var isValid: Boolean = true

        if (cpfOrEmail.isEmpty()) {
            view.showErrorCpfOrEmail(R.string.msg_error_empty)
            return
        }

        // chama o serviço
        repository.register(cpfOrEmail)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ result ->
                view.success(result)
            },
                { throwable ->
                    view.fail(throwable.message!!)
                }
            )
    }
}