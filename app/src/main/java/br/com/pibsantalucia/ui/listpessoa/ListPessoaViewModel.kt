package br.com.pibsantalucia.ui.listpessoa

import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.repository.LoginRepository
import br.com.pibsantalucia.repository.PessoaRepository
import br.com.pibsantalucia.ui.login.LoginActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ListPessoaViewModel: ViewModel() {

    internal val repository: PessoaRepository
    lateinit var view: IListPessoaFragment

    init {
        repository = PessoaRepository()
    }

    fun listPeoples() {
        repository.listPeoples()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({result ->
                view.success(result)
            },
                { throwable ->
                    view.failList(throwable.message!!)
                }
            )
    }

    fun prepareRegistration() {
        repository.prepareRegistration()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({result ->
                view.successListTypeContact(result.listTypeContact)
            },
                { throwable ->
                    view.fail(throwable.message!!)
                }
            )
    }

    fun getPerson(pesCodigo: Long) {
        repository.getPerson(pesCodigo)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({result ->
                view.success(result)
            },
                { throwable ->
                    view.fail(throwable.message!!)
                }
            )
    }
}
