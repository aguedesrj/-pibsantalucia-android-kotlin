package br.com.pibsantalucia.ui.reconciliacao

import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Obito
import br.com.pibsantalucia.model.Reconciliacao
import br.com.pibsantalucia.repository.PessoaRepository
import br.com.pibsantalucia.ui.transferencia.ITransferenciaActivity
import br.com.pibsantalucia.utils.isDataMaiorQueAtual
import br.com.pibsantalucia.utils.isDataValida
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ReconciliacaoViewModel: ViewModel() {

    private var repository: PessoaRepository
    lateinit var view: IReconciliacaoActivity

    init {
        repository = PessoaRepository()
    }

    fun save(reconciliacao: Reconciliacao) {

        if (reconciliacao.recDtReconciliacao!!.isEmpty()!!) {
            view.showErrorData(R.string.msg_error_empty)
            return
        } else if (!isDataValida(reconciliacao.recDtReconciliacao!!)) {
            view.showErrorData(R.string.field_date_invalid)
            return
        } else if (!isDataMaiorQueAtual(reconciliacao.recDtReconciliacao!!)) {
            view.showErrorData(R.string.field_can_not_greater_equal_to_current_date)
            return
        }

        view.loading("Salvando...")

        repository.saveReconciliacao(reconciliacao)
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