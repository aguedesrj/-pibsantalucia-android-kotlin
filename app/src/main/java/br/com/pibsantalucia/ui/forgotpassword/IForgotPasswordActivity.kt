package br.com.pibsantalucia.ui.forgotpassword

import br.com.pibsantalucia.model.User

interface IForgotPasswordActivity {
    fun showErrorCpfOrEmail(message: Int)
    fun success(message: String)
    fun fail(message: String)
}