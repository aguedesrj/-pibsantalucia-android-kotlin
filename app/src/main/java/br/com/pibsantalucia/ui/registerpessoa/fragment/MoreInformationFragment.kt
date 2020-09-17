package br.com.pibsantalucia.ui.registerpessoa.fragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Person
import br.com.pibsantalucia.utils.isCampoPreenchido
import br.com.pibsantalucia.utils.isDataMaiorQueAtual
import br.com.pibsantalucia.utils.isDataValida
import kotlinx.android.synthetic.main.data_personal_fragment.*
import kotlinx.android.synthetic.main.more_information_fragment.*

class MoreInformationFragment: Fragment() {

    companion object {
        fun newInstance() = MoreInformationFragment()
    }

    lateinit var person: Person

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.more_information_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        init()
    }

    private fun init() {

        // verifica se está alterando.
        if (person.pesCodigo != null && person.pesCodigo > 0) {
            this.assignValuesToScreen()
        }

        textInputEditTextCongregadoMom.requestFocus()
    }

    fun assignValuesToPerson(): Person {
        // Mãe
        person.pesNomeMae = textInputEditTextCongregadoMom.text.toString().trim()
        // Pai
        person.pesNomePai = textInputEditTextCongregadoFather.text.toString().trim()
        // Data de casamento
        person.pesDtCasamento = textInputEditTextCongregadoDateMarriage.text.toString().trim()
        // Data de batismo
        person.pesDtBatismo = textInputEditTextCongregadoDateBaptism.text.toString().trim()
        // Membro da Igreja
        if (radioButtonCongregadoMembroSim.isChecked) {
            person.pesFglMembro = "S"
        } else {
            person.pesFglMembro = "N"
        }
        // Observação
        person.pesObservacao = textInputEditTextCongregadoObs.text.toString().trim()

        return person
    }

    fun assignValuesToScreen() {
        // Mãe
        textInputEditTextCongregadoMom.setText(person.pesNomeMae)
        // Pai
        textInputEditTextCongregadoFather.setText(person.pesNomePai)
        // Data de casamento
        textInputEditTextCongregadoDateMarriage.setText(person.pesDtCasamento)
        // Data de batismo
        textInputEditTextCongregadoDateBaptism.setText(person.pesDtBatismo)
        // Membro da Igreja
        radioButtonCongregadoMembroSim.isChecked = person.pesFglMembro.equals("S")
        radioButtonCongregadoMembroNao.isChecked = person.pesFglMembro.equals("N")
        // Observação
        textInputEditTextCongregadoObs.setText(person.pesObservacao)
    }

    fun validateFields(): Boolean {
        // Data de casamento
        if (isCampoPreenchido(textInputEditTextCongregadoDateMarriage.text.toString())) {
            if (!isDataValida(textInputEditTextCongregadoDateMarriage.text.toString())) {
                textInputEditTextCongregadoDateMarriage.error = getString(R.string.field_date_invalid)
            } else if (!isDataMaiorQueAtual(textInputEditTextCongregadoDateMarriage.text.toString())) {
                textInputEditTextCongregadoDateMarriage.error = getString(R.string.field_can_not_greater_equal_to_current_date)
            }
        }
        // Data de batismo
        if (isCampoPreenchido(textInputEditTextCongregadoDateBaptism.text.toString())) {
            if (!isDataValida(textInputEditTextCongregadoDateBaptism.text.toString())) {
                textInputEditTextCongregadoDateBaptism.error = getString(R.string.field_date_invalid)
            } else if (!isDataMaiorQueAtual(textInputEditTextCongregadoDateBaptism.text.toString())) {
                textInputEditTextCongregadoDateBaptism.error = getString(R.string.field_can_not_greater_equal_to_current_date)
            }
        }
        // Membro da Igreja
        if (!radioButtonCongregadoMembroSim.isChecked && !radioButtonCongregadoMembroNao.isChecked) {
            radioButtonCongregadoMembroSim.error = getString(R.string.required_field)
        }

        return (textInputEditTextCongregadoDateMarriage.error == null &&
                textInputEditTextCongregadoDateBaptism.error == null &&
                radioButtonCongregadoMembroSim.error == null)
    }
}
