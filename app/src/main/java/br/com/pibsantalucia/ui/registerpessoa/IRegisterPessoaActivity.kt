package br.com.pibsantalucia.ui.registerpessoa

import br.com.pibsantalucia.model.User

interface IRegisterPessoaActivity {

    fun success(message: String)
    fun fail(message: String)
}