package br.com.pibsantalucia.ui.aniversariantes

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.repository.PessoaRepository
import br.com.pibsantalucia.ui.membros.IMembrosFragment
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class AniversarientesViewModel: ViewModel() {

    internal val repository: PessoaRepository
    lateinit var view: IMembrosFragment

    init {
        repository = PessoaRepository()
    }

    @SuppressLint("CheckResult")
    fun listAniversariantes() {
        repository.listAniversariantes()
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

    @SuppressLint("CheckResult")
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