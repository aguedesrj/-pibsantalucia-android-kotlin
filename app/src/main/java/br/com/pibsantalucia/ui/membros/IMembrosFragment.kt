package br.com.pibsantalucia.ui.membros

import br.com.pibsantalucia.model.ListPeople
import br.com.pibsantalucia.model.Person
import br.com.pibsantalucia.model.TypeContact

interface IMembrosFragment {
    fun success(person: Person)
    fun success(list: ArrayList<ListPeople>)
    fun fail(message: String)
    fun failList(message: String)
}