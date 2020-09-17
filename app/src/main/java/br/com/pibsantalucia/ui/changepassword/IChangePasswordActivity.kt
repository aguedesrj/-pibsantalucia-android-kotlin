package br.com.pibsantalucia.ui.changepassword

import br.com.pibsantalucia.model.User

interface IChangePasswordActivity {
    fun showErrorNewPassword(message: Int)
    fun showErrorNewPasswordConfirmation(message: Int)
    fun success(message: String, user: User)
    fun fail(message: String)
}