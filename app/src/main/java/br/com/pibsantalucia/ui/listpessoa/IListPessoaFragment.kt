package br.com.pibsantalucia.ui.listpessoa

import br.com.pibsantalucia.model.ListPeople
import br.com.pibsantalucia.model.Person
import br.com.pibsantalucia.model.Profession
import br.com.pibsantalucia.model.TypeContact

interface IListPessoaFragment {
    fun success(person: Person)
    fun success(list: ArrayList<ListPeople>)
    fun successListTypeContact(listTypeContact: ArrayList<TypeContact>)
    fun fail(message: String)
    fun failList(message: String)
}