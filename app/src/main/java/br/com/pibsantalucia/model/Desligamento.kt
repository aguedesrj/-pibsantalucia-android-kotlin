package br.com.pibsantalucia.model

import java.io.Serializable

class Desligamento: Serializable {
    var pesCodigo: Long = 0
    var desDtDesligamento: String? = null
    var desObservacao: String? = null
}