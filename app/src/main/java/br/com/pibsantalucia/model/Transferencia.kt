package br.com.pibsantalucia.model

import java.io.Serializable

class Transferencia: Serializable {
    var pesCodigo: Long = 0
    var traMotivo: String? = null
    var traNomeIgreja: String? = null
    var traStatus: String? = null
    var traObservacao: String? = null
    var traDtTransferencia: String? = null
}