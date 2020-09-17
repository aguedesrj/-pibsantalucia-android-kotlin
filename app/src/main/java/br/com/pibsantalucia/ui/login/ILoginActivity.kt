package br.com.pibsantalucia.ui.login

import br.com.pibsantalucia.model.User

interface ILoginActivity {
    fun showErrorEmail(message: Int)
    fun showErrorPassword(message: Int)
    fun success(user: User)
    fun fail(message: String)
}