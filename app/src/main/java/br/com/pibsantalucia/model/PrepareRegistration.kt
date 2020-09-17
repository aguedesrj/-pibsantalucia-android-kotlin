package br.com.pibsantalucia.model

import com.google.gson.annotations.SerializedName

class PrepareRegistration {

    @SerializedName("listaTipoContatoVO")
    lateinit var listTypeContact: ArrayList<TypeContact>
}