package br.com.pibsantalucia.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Contact: Serializable {

    var ctoCodigo: Long = 0
    var ctoDescricaoEmail: String? = null
    var ctoDdd: String? = null
    var ctoNumeroTelefone: String? = null
    @SerializedName("novoContato")
    var newContact: Boolean = false
    @SerializedName("excluidoContato")
    var removeContact: Boolean = false
    @SerializedName("tipoContatoVO")
    var typeContact: TypeContact? = null
    var localOnly: Boolean = false
}