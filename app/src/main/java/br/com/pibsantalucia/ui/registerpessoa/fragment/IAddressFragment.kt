package br.com.pibsantalucia.ui.registerpessoa.fragment

import br.com.pibsantalucia.model.User
import br.com.pibsantalucia.model.ViaCep

interface IAddressFragment {
    fun showErrorCep(message: Int)
    fun success(viaCep: ViaCep)
    fun fail(message: String)
}