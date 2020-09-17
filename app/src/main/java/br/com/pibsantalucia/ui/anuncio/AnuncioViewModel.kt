package br.com.pibsantalucia.ui.anuncio

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.model.Anuncio
import br.com.pibsantalucia.repository.AnuncioRepository
import br.com.pibsantalucia.repository.PessoaRepository
import br.com.pibsantalucia.ui.membros.IMembrosFragment
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class AnuncioViewModel: ViewModel() {

    internal val repository: AnuncioRepository
    lateinit var view: IAnuncioFragment

    init {
        repository = AnuncioRepository()
    }

    @SuppressLint("CheckResult")
    fun list() {
        repository.list()
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