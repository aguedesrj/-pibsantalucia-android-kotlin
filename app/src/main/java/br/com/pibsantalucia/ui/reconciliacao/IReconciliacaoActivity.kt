package br.com.pibsantalucia.ui.reconciliacao

interface IReconciliacaoActivity {

    fun loading(message: String)
    fun showErrorData(message: Int)
    fun success(message: String)
    fun fail(message: String)
}