package br.com.pibsantalucia.ui.membros

import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.repository.PessoaRepository
import br.com.pibsantalucia.ui.listpessoa.IListPessoaFragment
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MembrosViewModel: ViewModel() {

    internal val repository: PessoaRepository
    lateinit var view: IMembrosFragment

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
