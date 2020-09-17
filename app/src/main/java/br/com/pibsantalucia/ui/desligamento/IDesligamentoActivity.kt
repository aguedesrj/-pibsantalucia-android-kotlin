package br.com.pibsantalucia.ui.desligamento

interface IDesligamentoActivity {

    fun loading(message: String)
    fun showErrorData(message: Int)
    fun success(message: String)
    fun fail(message: String)
}