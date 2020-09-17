package br.com.pibsantalucia.model

import com.google.gson.annotations.SerializedName

class ResponsePayload<T> {

    @SerializedName("code")
    internal var code: Int = 0

    @SerializedName("message")
    internal var message: String? = null

    @SerializedName("object")
    internal var data: T? = null
}