package br.com.pibsantalucia

import br.com.pibsantalucia.model.Person

interface IMainActivity {

    fun success(person: Person)
    fun fail(message: String)
}