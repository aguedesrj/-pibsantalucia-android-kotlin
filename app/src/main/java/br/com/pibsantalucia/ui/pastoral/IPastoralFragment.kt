package br.com.pibsantalucia.ui.pastoral

import br.com.pibsantalucia.model.Pastoral
import br.com.pibsantalucia.model.Person

interface IPastoralFragment {
    fun success(pastoral: Pastoral)
    fun fail(message: String)
}