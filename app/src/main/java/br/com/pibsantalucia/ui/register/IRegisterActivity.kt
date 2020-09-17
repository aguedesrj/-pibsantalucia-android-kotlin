package br.com.pibsantalucia.ui.register

import br.com.pibsantalucia.model.User

interface IRegisterActivity {
    fun showErrorCpfOrEmail(message: Int)
    fun success(message: String)
    fun fail(message: String)
}