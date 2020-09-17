package br.com.pibsantalucia.model

import java.io.Serializable

class DeviceMobile: Serializable {
    var demId: String? = null
    var demOs: String? = null
    var demVersao: String? = null
    var demTokenFirebase: String? = null
    var pesCodigo: Long = 0
}