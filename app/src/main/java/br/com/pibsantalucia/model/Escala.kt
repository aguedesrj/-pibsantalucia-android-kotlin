package br.com.pibsantalucia.model

import java.io.Serializable

class Escala: Serializable {
    var escCodigo: Long = 0
    var escDtEscala: String = ""
    var escFlgTipo: String = ""
    var escDescricao: String = ""
    var escAnoMes: Int = 0
    var lista: ArrayList<ListPeople> = ArrayList()
}