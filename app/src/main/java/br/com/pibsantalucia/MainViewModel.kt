package br.com.pibsantalucia

import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.model.DeviceMobile
import br.com.pibsantalucia.model.Person
import br.com.pibsantalucia.repository.PessoaRepository
import br.com.pibsantalucia.ui.registerpessoa.IRegisterPessoaActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainViewModel: ViewModel() {

    var repository: PessoaRepository
    lateinit var view: IMainActivity

    init {
        repository = PessoaRepository()
    }

    fun saveDeviceMobile(deviceMobile: DeviceMobile) {

        repository.saveDeviceMobile(deviceMobile)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ result ->
                //view.success(result)
                // não faz nada
            },
                { throwable ->
                    //view.fail(throwable.message!!)
                    // não faz nada
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