package br.com.pibsantalucia.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Person: Serializable {

    var pesCodigo: Long = 0
    var pesNome: String? = null
    var pesDtNascimento: String? = null
    var pesSexo: String? = null
    var pesCpf: String? = null
    var pesTipoSanguineo: String? = null
    var pesNaturalidade: String? = null
    var pesNacionalidade: String? = null
    var pesNomeMae: String? = null
    var pesNomePai: String? = null
    var pesDtCasamento: String? = null
    var pesFoto: String? = null
    var pesObservacao: String? = null
    var pesDtBatismo: String? = null
    var pesDtCadastro: String? = null
    var pesFglMembro: String? = null
    var pesProfissao: String? = null
    var pesFotoPath: String? = null
    @SerializedName("enderecoVO")
    var address: Address? = null
    @SerializedName("listaContatoVO")
    var listContact: ArrayList<Contact>? = null
    var enderecoCompleto: String? = null
    var telefoneCompleto: String? = null
    var dtAniversarioFmt: String? = null
}