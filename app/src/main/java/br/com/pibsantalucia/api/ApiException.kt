package br.com.pibsantalucia.api

class ApiException: RuntimeException {

    private var code: Int = 0

    constructor(message: String): super(message)

    constructor(ex: Exception): super(ex)

    constructor(code: Int, message: String): super(message) {
        this.code = code
    }

    fun getCode(): Int {
        return code
    }
}