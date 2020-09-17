package br.com.pibsantalucia.ui.registerpessoa.fragment

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.R
import br.com.pibsantalucia.repository.LoginRepository
import br.com.pibsantalucia.repository.PessoaRepository
import br.com.pibsantalucia.ui.login.ILoginActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.address_fragment.*

class AddressViewModel : ViewModel() {

    var repository: PessoaRepository
    lateinit var view: IAddressFragment

    init {
        repository = PessoaRepository()
    }

    @SuppressLint("CheckResult")
    fun searchForCep(cep: String) {

        if (cep.isEmpty()) {
            view.showErrorCep(R.string.msg_error_cep_empty)
            return
        }

        repository.searchForCep(cep)
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
