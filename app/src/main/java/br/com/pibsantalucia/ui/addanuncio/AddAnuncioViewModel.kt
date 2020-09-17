package br.com.pibsantalucia.ui.addanuncio

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.model.Anuncio
import br.com.pibsantalucia.repository.AnuncioRepository
import br.com.pibsantalucia.repository.EscalaRepository
import br.com.pibsantalucia.repository.PessoaRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class AddAnuncioViewModel: ViewModel() {

    internal val repository: AnuncioRepository
    lateinit var view: IAddAnuncioActivity

    init {
        repository = AnuncioRepository()
    }

    @SuppressLint("CheckResult")
    fun save(anuncio: Anuncio) {
        repository.save(anuncio)
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