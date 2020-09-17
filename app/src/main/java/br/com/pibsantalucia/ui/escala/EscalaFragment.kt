package br.com.pibsantalucia.ui.escala


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.*
import br.com.pibsantalucia.ui.base.BaseFragment
import br.com.pibsantalucia.ui.detalhemembro.DetalheMembroActivity
import br.com.pibsantalucia.ui.pesquisamembro.PesquisaMembroActivity
import br.com.pibsantalucia.utils.isPerfilSecretaria
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.list.listItemsSingleChoice


class EscalaFragment: BaseFragment(), IEscalaFragment, OnClickEscalaListener {

    lateinit var tipoEscala: TipoEscala

    private lateinit var textViewEscalaMesSelecionado: TextView
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: EscalaViewModel
    private lateinit var escalaSelecionada: Escala

    private var lista: ArrayList<EscalaMeses> = arrayListOf()
    private var adapter: EscalaAdapter =
        EscalaAdapter()
    private var listaMeses = ArrayList<String>()
    private var listaPeople: ArrayList<ListPeople> = arrayListOf()
    private var indexMesEscalaSelecionada: Int = 0

    companion object {
        fun newInstance() = EscalaFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.escala_fragment, container, false)

        this.activity?.setTitle(tipoEscala.descricao)

        recyclerView = view.findViewById(R.id.recyclerViewEscala)
        textViewEscalaMesSelecionado = view.findViewById(R.id.textViewEscalaMesSelecionado)
        var buttonEscalaMes: Button = view.findViewById(R.id.buttonEscalaMes)

        buttonEscalaMes.setOnClickListener(View.OnClickListener {
            this.showMaterialDialog()
        })

        adapter.listener = this
        recyclerView.adapter = adapter

        setHasOptionsMenu(true)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(EscalaViewModel::class.java)

        loading()
        viewModel.lista(tipoEscala.value)

        viewModel.view = this
    }

    override fun success(lista: ArrayList<EscalaMeses>) {
        this.lista = lista

        for (escala in lista) {
            listaMeses.add(escala.mesDescricao)
        }

        textViewEscalaMesSelecionado.text = listaMeses.get(indexMesEscalaSelecionada)
        adapter.list = this.lista.get(indexMesEscalaSelecionada).listaEscalas
        adapter.notifyDataSetChanged()

        this.hideLoading()
    }

    override fun successPerson(person: Person) {
        this.hideLoading()

        val extras = Bundle()
        extras.putSerializable("person", person)

        var intent = Intent(requireActivity(), DetalheMembroActivity::class.java)
        intent.putExtras(extras)

        startActivity(intent)
    }

    override fun successSalvar(message: String) {
        this.hideLoading()
        this.showMessage(message)
    }

    override fun successListPeople(list: ArrayList<ListPeople>) {
        this.hideLoading()

        this.listaPeople = list
        showScreenPesquisaMembros()
    }

    private fun showMaterialDialog() {
        if (!lista.isEmpty()) {
            MaterialDialog(this.requireActivity()).show {
                title(R.string.selecione_mes_escala)
                listItemsSingleChoice(items = listaMeses) { _, index, text ->
                    indexMesEscalaSelecionada = index
                    textViewEscalaMesSelecionado.text = listaMeses.get(indexMesEscalaSelecionada)

                    adapter.list = lista.get(index).listaEscalas
                    adapter.notifyDataSetChanged()
                }
                positiveButton(R.string.dialog_neutral_button)
            }
        }
    }

    override fun fail(message: String) {
        this.hideLoading()
        this.showMessage(message)
    }

    private fun showScreenPesquisaMembros() {

        var intent = Intent(requireActivity(), PesquisaMembroActivity::class.java)
        intent.putExtra("ListPeople", listaPeople)

        startActivityForResult(intent, 999)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK && requestCode == 999) {
            val person: ListPeople = data?.getSerializableExtra("MEMBRO") as ListPeople
            for (escala in lista.get(indexMesEscalaSelecionada).listaEscalas) {
                // verifica se é a mesma escala
                if (escala.escCodigo == escalaSelecionada.escCodigo) {
                    // verifica se o membro já foi incluído
                    var isJaSelecionado: Boolean = false
                    for (membro in escala.lista) {
                        if (membro.pesCodigo == person.pesCodigo) {
                            isJaSelecionado = true
                            break
                        }
                    }

                    if (!isJaSelecionado) {
                        escala.lista.add(person)

                        adapter.notifyDataSetChanged()
                        break
                    }
                }
            }
        }

        super.onActivityResult(requestCode, resultCode, data)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        if (isPerfilSecretaria()) {
            inflater!!.inflate(R.menu.menu_save, menu)
        }
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_save && !this.lista.isEmpty()) {
            this.loading()
            this.viewModel.salvar(lista)
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onItemClick(escala: Escala) {
        escalaSelecionada = escala

        if (listaPeople.isEmpty()) {
            // chama o serviço que retorna a lista de membros
            this.loading()
            viewModel.listPeoples()
        } else {
            showScreenPesquisaMembros()
        }
    }

    override fun onItemClick(membro: ListPeople) {
        // exibir detalhe do membro
        loading()
        viewModel.getPerson(membro.pesCodigo)
    }

    override fun notifyDataSetChanged() {
        adapter.notifyDataSetChanged()
    }
}