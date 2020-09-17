package br.com.pibsantalucia.ui.escala

import br.com.pibsantalucia.model.Escala
import br.com.pibsantalucia.model.ListPeople

interface OnClickEscalaListener {
    fun onItemClick(escala: Escala)
    fun onItemClick(membro: ListPeople)
    fun notifyDataSetChanged()
}