package br.com.pibsantalucia.ui.escala

import br.com.pibsantalucia.R

enum class TipoEscala(val value: Int, val descricao: Int, val nome: Int) {
    DATASHOW(1, R.string.menu_escala_datashow, R.string.menu_escala_datashow_nome),
    MUSICA(2, R.string.menu_escala_musica, R.string.menu_escala_musica_nome),
    PORTARIA(3, R.string.menu_escala_portaria, R.string.menu_escala_portaria_nome),
    SOM(4, R.string.menu_escala_som, R.string.menu_escala_som_nome),
}