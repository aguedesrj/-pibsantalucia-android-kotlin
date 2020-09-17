package br.com.pibsantalucia.ui.registerpessoa

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.model.Person
import br.com.pibsantalucia.repository.LoginRepository
import br.com.pibsantalucia.repository.PessoaRepository
import br.com.pibsantalucia.ui.login.ILoginActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class RegisterPessoaViewModel: ViewModel() {

    var repository: PessoaRepository
    lateinit var view: IRegisterPessoaActivity

    init {
        repository = PessoaRepository()
    }

    @SuppressLint("CheckResult")
    fun save(person: Person) {
        repository.save(person)
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