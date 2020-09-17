package br.com.pibsantalucia.ui.pastoral

import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.repository.LoginRepository
import br.com.pibsantalucia.repository.PessoaRepository
import br.com.pibsantalucia.ui.listpessoa.IListPessoaFragment
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class PastoralViewModel : ViewModel() {

    internal val repository: PessoaRepository
    lateinit var view: IPastoralFragment

    init {
        repository = PessoaRepository()
    }

    fun pastoral() {
        repository.pastoral()
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
