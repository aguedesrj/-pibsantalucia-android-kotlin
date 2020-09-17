package br.com.pibsantalucia.model

import java.io.Serializable

class Reconciliacao: Serializable {
    var pesCodigo: Long = 0
    var recDtReconciliacao: String? = null
    var recObservacao: String? = null
}