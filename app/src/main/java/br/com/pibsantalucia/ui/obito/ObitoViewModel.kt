package br.com.pibsantalucia.ui.obito

import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Desligamento
import br.com.pibsantalucia.model.Obito
import br.com.pibsantalucia.repository.PessoaRepository
import br.com.pibsantalucia.ui.transferencia.ITransferenciaActivity
import br.com.pibsantalucia.utils.isDataMaiorQueAtual
import br.com.pibsantalucia.utils.isDataValida
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ObitoViewModel: ViewModel() {

    private var repository: PessoaRepository
    lateinit var view: IObitoActivity

    init {
        repository = PessoaRepository()
    }

    fun save(obito: Obito) {

        if (obito.obiDtObito!!.isEmpty()!!) {
            view.showErrorData(R.string.msg_error_empty)
            return
        } else if (!isDataValida(obito.obiDtObito!!)) {
            view.showErrorData(R.string.field_date_invalid)
            return
        } else if (!isDataMaiorQueAtual(obito.obiDtObito!!)) {
            view.showErrorData(R.string.field_can_not_greater_equal_to_current_date)
            return
        }

        view.loading("Salvando...")

        repository.saveObito(obito)
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