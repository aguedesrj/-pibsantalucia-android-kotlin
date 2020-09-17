package br.com.pibsantalucia.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ViaCep: Serializable {
    @SerializedName("cep")
    var cep: String = ""
    @SerializedName("logradouro")
    var publicPlace: String = ""
    @SerializedName("complemento")
    var complement: String = ""
    @SerializedName("bairro")
    var district: String = ""
    @SerializedName("localidade")
    var city: String = ""
    @SerializedName("estado")
    var state: String = ""
}