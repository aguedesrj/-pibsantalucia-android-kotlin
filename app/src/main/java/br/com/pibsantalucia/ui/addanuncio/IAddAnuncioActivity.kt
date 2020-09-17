package br.com.pibsantalucia.ui.addanuncio

import br.com.pibsantalucia.model.Anuncio

interface IAddAnuncioActivity {
    fun success(message: String)
    fun fail(message: String)
}