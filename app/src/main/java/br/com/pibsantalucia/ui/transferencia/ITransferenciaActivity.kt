package br.com.pibsantalucia.ui.transferencia

interface ITransferenciaActivity {

    fun loading(message: String)
    fun showErrorData(message: Int)
    fun showErrorStatus(message: Int)
    fun success(message: String)
    fun fail(message: String)
}