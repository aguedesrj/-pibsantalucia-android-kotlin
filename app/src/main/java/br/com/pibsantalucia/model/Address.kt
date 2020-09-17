package br.com.pibsantalucia.model

import java.io.Serializable

class Address: Serializable {

    var endCodigo: Long = 0
    var endLogradouro: String? = null
    var endComplemento: String? = null
    var endNumero: String? = null
    var endBairro: String? = null
    var endCidade: String? = null
    var endCep: String? = null
    var endEstado: String? = null
}