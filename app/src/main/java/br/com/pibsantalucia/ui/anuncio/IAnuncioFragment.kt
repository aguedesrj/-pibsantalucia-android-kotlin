package br.com.pibsantalucia.ui.anuncio

import br.com.pibsantalucia.model.Anuncio
import br.com.pibsantalucia.model.EscalaMeses
import br.com.pibsantalucia.model.ListPeople
import br.com.pibsantalucia.model.Person

interface IAnuncioFragment {
    fun success(lista: ArrayList<Anuncio>)
    fun fail(message: String)
}