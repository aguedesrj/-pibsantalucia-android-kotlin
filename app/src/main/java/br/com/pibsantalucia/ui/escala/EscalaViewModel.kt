package br.com.pibsantalucia.ui.escala

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.model.EscalaMeses
import br.com.pibsantalucia.repository.EscalaRepository
import br.com.pibsantalucia.repository.PessoaRepository
import br.com.pibsantalucia.ui.membros.IMembrosFragment
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class EscalaViewModel: ViewModel() {

    internal val repository: EscalaRepository
    internal val repositoryPesssoa: PessoaRepository
    lateinit var view: IEscalaFragment

    init {
        repository = EscalaRepository()
        repositoryPesssoa = PessoaRepository()
    }

    @SuppressLint("CheckResult")
    fun lista(escFlgTipo: Int) {
        repository.lista(escFlgTipo)
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

    @SuppressLint("CheckResult")
    fun listPeoples() {
        repositoryPesssoa.listPeoples()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({result ->
                view.successListPeople(result)
            },
                { throwable ->
                    view.fail(throwable.message!!)
                }
            )
    }

    @SuppressLint("CheckResult")
    fun getPerson(pesCodigo: Long) {
        repositoryPesssoa.getPerson(pesCodigo)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({result ->
                view.successPerson(result)
            },
                { throwable ->
                    view.fail(throwable.message!!)
                }
            )
    }

    @SuppressLint("CheckResult")
    fun salvar(lista: ArrayList<EscalaMeses>) {
        repository.salvar(lista)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({result ->
                view.successSalvar(result)
            },
                { throwable ->
                    view.fail(throwable.message!!)
                }
            )
    }
}