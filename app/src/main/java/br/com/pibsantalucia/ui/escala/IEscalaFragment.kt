package br.com.pibsantalucia.ui.escala

import br.com.pibsantalucia.model.EscalaMeses
import br.com.pibsantalucia.model.EscalaPeriodo
import br.com.pibsantalucia.model.ListPeople
import br.com.pibsantalucia.model.Person

interface IEscalaFragment {
    fun success(lista: ArrayList<EscalaMeses>)
    fun successListPeople(list: ArrayList<ListPeople>)
    fun successPerson(person: Person)
    fun successSalvar(message: String)
    fun fail(message: String)
}