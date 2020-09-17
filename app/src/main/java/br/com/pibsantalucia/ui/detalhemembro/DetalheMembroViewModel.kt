package br.com.pibsantalucia.ui.detalhemembro

import androidx.lifecycle.ViewModel
import br.com.pibsantalucia.repository.PessoaRepository
import br.com.pibsantalucia.ui.listpessoa.IListPessoaFragment

class DetalheMembroViewModel: ViewModel() {

    internal val repository: PessoaRepository
    lateinit var view: IDetalheMembroActivity

    init {
        repository = PessoaRepository()
    }
}