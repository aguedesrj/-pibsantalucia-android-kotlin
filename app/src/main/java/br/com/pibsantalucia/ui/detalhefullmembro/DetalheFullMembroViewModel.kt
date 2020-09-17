package br.com.pibsantalucia.ui.detalhefullmembro

import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.repository.PessoaRepository
import br.com.pibsantalucia.ui.detalhemembro.IDetalheMembroActivity

class DetalheFullMembroViewModel: ViewModel() {

    internal val repository: PessoaRepository
    lateinit var view: IDetalheFullMembroActivity

    init {
        repository = PessoaRepository()
    }
}