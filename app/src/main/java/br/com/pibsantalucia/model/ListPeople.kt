package br.com.pibsantalucia.model

import java.io.Serializable

class ListPeople: Serializable {

    var pesCodigo: Long = 0
    var pesNome: String = ""
    var pesFotoPath: String = ""
    var pesSexo: String = ""
    var dtAniversarioFmt: String = ""
    var pesFglMembro: Boolean = false
    var pesObito: Boolean = false
    var pesDesligamento: Boolean = false
    var pesTransferencia: Boolean = false
}