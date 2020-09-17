package br.com.pibsantalucia.ui.detalhemembro

import br.com.pibsantalucia.model.Contact
import br.com.pibsantalucia.model.ListPeople

interface OnItemClickContact {
    fun onItemClickWhatsApp(contact: Contact)
    fun onItemClickPhone(contact: Contact)
}