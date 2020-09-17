package br.com.pibsantalucia.ui.splash

import br.com.pibsantalucia.model.User

interface ISplashActivity {
    fun success(user: User)
    fun fail(message: String)
}