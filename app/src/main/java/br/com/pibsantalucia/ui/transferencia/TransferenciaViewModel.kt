package br.com.pibsantalucia.ui.transferencia

import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Transferencia
import br.com.pibsantalucia.repository.LoginRepository
import br.com.pibsantalucia.repository.PessoaRepository
import br.com.pibsantalucia.ui.login.ILoginActivity
import br.com.pibsantalucia.utils.isDataMaiorQueAtual
import br.com.pibsantalucia.utils.isDataValida
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.data_personal_fragment.*

class TransferenciaViewModel: ViewModel() {

    private var repository: PessoaRepository
    lateinit var view: ITransferenciaActivity

    init {
        repository = PessoaRepository()
    }

    fun save(transferencia: Transferencia) {

        var isValid: Boolean = true

        if (transferencia.traDtTransferencia!!.isEmpty()!!) {
            view.showErrorData(R.string.msg_error_empty)
            isValid = false
        } else if (!isDataValida(transferencia.traDtTransferencia!!)) {
            view.showErrorData(R.string.field_date_invalid)
            isValid = false
        } else if (!isDataMaiorQueAtual(transferencia.traDtTransferencia!!)) {
            view.showErrorData(R.string.field_can_not_greater_equal_to_current_date)
            isValid = false
        }

        if (transferencia.traStatus == null || transferencia.traStatus!!.isEmpty()) {
            view.showErrorStatus(R.string.msg_error_empty)
            isValid = false
        }

        if (isValid) {
            view.loading("Salvando...")

            repository.saveTransferencia(transferencia)
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
}