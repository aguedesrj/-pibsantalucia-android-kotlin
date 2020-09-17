package br.com.pibsantalucia.model

import java.io.Serializable

class EscalaMeses: Serializable {

    var mes: Int = 0
    var mesDescricao: String = ""
    var ano: Int = 0
    var listaEscalas: ArrayList<Escala> = ArrayList()
}