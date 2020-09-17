package br.com.pibsantalucia.ui.escala

import br.com.pibsantalucia.model.Escala
import br.com.pibsantalucia.model.ListPeople

interface OnClickEscalaChildListener {
    fun onItemClick(escala: Escala, membro: ListPeople)
    fun onItemClick(membro: ListPeople)
}