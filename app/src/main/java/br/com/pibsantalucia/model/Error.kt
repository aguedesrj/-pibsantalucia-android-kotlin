package br.com.pibsantalucia.model

import com.google.gson.annotations.SerializedName

open class Error {

    @SerializedName("code")
    internal var code: Int = 0

    @SerializedName("message")
    internal var message: String = ""
}