package br.com.pibsantalucia.ui.registerpessoa.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Address
import br.com.pibsantalucia.model.Person
import br.com.pibsantalucia.model.ViaCep
import br.com.pibsantalucia.ui.base.BaseFragment
import br.com.pibsantalucia.utils.firebaseAnalyticsEvents
import kotlinx.android.synthetic.main.address_fragment.*
import kotlinx.android.synthetic.main.more_information_fragment.*

class AddressFragment: BaseFragment(), IAddressFragment {

    companion object {
        fun newInstance() = AddressFragment()
    }

    private lateinit var viewModel: AddressViewModel

    var person: Person? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.address_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AddressViewModel::class.java)
        viewModel.view = this

        init()
    }

    private fun init() {

        // verifica se está alterando.
        if (person!!.pesCodigo > 0) {
            this.assignValuesToScreen()
        }

        textInputEditTextCongregadoCep.requestFocus()

        imageButtonCongregadoCep.setOnClickListener(View.OnClickListener {
            this.loading("Obtendo endereço...")

            firebaseAnalyticsEvents(requireActivity(), "RegistroMembro", "GetCep")

            viewModel.searchForCep(textInputEditTextCongregadoCep.text.toString().trim())
        })
    }

    fun assignValuesToPerson(): Person {
        if (person!!.address == null) {
            person!!.address = Address()
        }

        // CEP
        person!!.address!!.endCep = textInputEditTextCongregadoCep.text.toString().trim()
        // Logradouro
        person!!.address!!.endLogradouro = textInputEditTextCongregadoPublicPlace.text.toString().trim()
        // Complemento
        person!!.address!!.endComplemento = textInputEditTextCongregadoComplement.text.toString().trim()
        // Número
        person!!.address!!.endNumero = textInputEditTextCongregadoNumber.text.toString().trim()
        // Bairro
        person!!.address!!.endBairro = textInputEditTextCongregadoDistrict.text.toString().trim()
        // Cidade
        person!!.address!!.endCidade = textInputEditTextCongregadoCity.text.toString().trim()
        // Estado
        person!!.address!!.endEstado = textInputEditTextCongregadoState.text.toString().trim()

        return person!!
    }

    private fun assignValuesToScreen() {
        if (person!!.address != null) { // CEP
            textInputEditTextCongregadoCep.setText(person!!.address!!.endCep)
            // Logradouro
            textInputEditTextCongregadoPublicPlace.setText(person!!.address!!.endLogradouro)
            // Complemento
            textInputEditTextCongregadoComplement.setText(person!!.address!!.endComplemento)
            // Número
            textInputEditTextCongregadoNumber.setText(person!!.address!!.endNumero)
            // Bairro
            textInputEditTextCongregadoDistrict.setText(person!!.address!!.endBairro)
            // Cidade
            textInputEditTextCongregadoCity.setText(person!!.address!!.endCidade)
            // Estado
            textInputEditTextCongregadoState.setText(person!!.address!!.endEstado)
        }
    }

    override fun showErrorCep(message: Int) {
        this.showMessage(getString(message))
    }

    override fun success(viaCep: ViaCep) {
        // Logradouro
        textInputEditTextCongregadoPublicPlace.setText(viaCep.publicPlace)
        // Complemento
        textInputEditTextCongregadoComplement.setText(viaCep.complement)
        // Bairro
        textInputEditTextCongregadoDistrict.setText(viaCep.district)
        // Cidade
        textInputEditTextCongregadoCity.setText(viaCep.city)
        // Estado
        textInputEditTextCongregadoState.setText(viaCep.state)

        this.hideLoading()
    }

    override fun fail(message: String) {
        this.showMessage("Não foi possível obter o endereço informado.")
    }

}
