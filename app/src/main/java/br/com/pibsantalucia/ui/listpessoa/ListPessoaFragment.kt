package br.com.pibsantalucia.ui.listpessoa

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.SearchView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.widget.ContentLoadingProgressBar
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.ListPeople
import br.com.pibsantalucia.model.Obito
import br.com.pibsantalucia.model.Person
import br.com.pibsantalucia.model.TypeContact
import br.com.pibsantalucia.ui.base.BaseFragment
import br.com.pibsantalucia.ui.desligamento.DesligamentoActivity
import br.com.pibsantalucia.ui.obito.ObitoActivity
import br.com.pibsantalucia.ui.reconciliacao.ReconciliacaoActivity
import br.com.pibsantalucia.ui.registerpessoa.RegisterPessoaActivity
import br.com.pibsantalucia.ui.transferencia.TransferenciaActivity
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.list.listItems
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.list_pessoa_fragment.*


class ListPessoaFragment: BaseFragment(), IListPessoaFragment, OnItemClickCongregadoListener {

    private lateinit var constraintLayoutListPessoaMessage: ConstraintLayout
    private lateinit var progressBar: ContentLoadingProgressBar
    private lateinit var buttonListPessoa: AppCompatButton
    private lateinit var recyclerViewListPessoa: RecyclerView
    private lateinit var floatingActionButtonListPessoa: FloatingActionButton
    private lateinit var textViewListPessoaMessage: TextView

    private var adapter = ListPessoaAdapter()
    private var personSelected: Person?? = null
    private var searchView: SearchView? = null
    private var queryTextListener: SearchView.OnQueryTextListener? = null

    companion object {
        fun newInstance() = ListPessoaFragment()
    }

    private lateinit var viewModel: ListPessoaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        adapter.listener = this

        var view: View = inflater.inflate(R.layout.list_pessoa_fragment, container, false)
        recyclerViewListPessoa = view.findViewById<RecyclerView>(R.id.recyclerViewListPessoa)
        recyclerViewListPessoa.layoutManager = LinearLayoutManager(activity)
        recyclerViewListPessoa.adapter = adapter
        recyclerViewListPessoa.visibility = View.GONE

        textViewListPessoaMessage = view.findViewById(R.id.textViewListPessoaMessage)

        constraintLayoutListPessoaMessage = view.findViewById(R.id.constraintLayoutListPessoaMessage)
        constraintLayoutListPessoaMessage.visibility = View.GONE

        progressBar = view.findViewById(R.id.progressBarListPessoa)
        buttonListPessoa = view.findViewById(R.id.buttonListPessoa)

        floatingActionButtonListPessoa = view.findViewById(R.id.floatingActionButtonListPessoa)

        setHasOptionsMenu(true)

        return view
    }

    override fun onStart() {
        super.onStart()

        this.getListMembros()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ListPessoaViewModel()::class.java)
        viewModel.view = this

        buttonListPessoa.setOnClickListener(View.OnClickListener {
            getListMembros()
        })

        floatingActionButtonListPessoa.setOnClickListener(View.OnClickListener {
            this.loading()

            this.personSelected = null
            viewModel.prepareRegistration()
        })
    }

    private fun getListMembros() {
        if (this.adapter.list != null) {
            this.adapter.list.clear()
            this.adapter.listFull.clear()
            this.adapter.notifyDataSetChanged()
        }

        textViewListPessoaResume.text = "Carregando..."
        constraintLayoutListPessoaMessage.visibility = View.GONE
        progressBar.visibility = View.VISIBLE
        recyclerViewListPessoa.visibility = View.GONE

        viewModel.listPeoples()
    }

    override fun successListTypeContact(listTypeContact: ArrayList<TypeContact>) {
        this.hideLoading()

        val extras = Bundle()
        extras.putSerializable("listTypeContact", listTypeContact)
        extras.putSerializable("person", this.personSelected)

        var intent = Intent(activity, RegisterPessoaActivity::class.java)
        intent.putExtras(extras)

        startActivity(intent)
    }

    override fun success(person: Person) {
        this.personSelected = person

        viewModel.prepareRegistration()
    }

    override fun success(list: ArrayList<ListPeople>) {
        progressBar.visibility = View.GONE
        constraintLayoutListPessoaMessage.visibility = View.GONE
        recyclerViewListPessoa.visibility = View.VISIBLE

        var listFilter: ArrayList<ListPeople> = ArrayList()
        var contSexoF: Int = 0
        var contSexoM: Int = 0
        // prepara resumo
        for (people in list) {
            if (people.pesFglMembro) {
                if (people.pesSexo == "F") {
                    contSexoF ++
                } else {
                    contSexoM ++
                }
                listFilter.add(people)
            }
        }

        textViewListPessoaResume.text = "Total: "
            .plus(contSexoF+contSexoM)
            .plus(" (Mulheres: ")
            .plus(contSexoF)
            .plus(" - Homens: ")
            .plus(contSexoM)
            .plus(")")

        adapter.list = listFilter
        adapter.listFull = listFilter
        adapter.notifyDataSetChanged()
    }

    override fun failList(message: String) {
        progressBar.visibility = View.GONE
        recyclerViewListPessoa.visibility = View.GONE
        constraintLayoutListPessoaMessage.visibility = View.VISIBLE

        textViewListPessoaMessage.text = getString(R.string.msg_error_try_again)
    }

    override fun fail(message: String) {
        this.showMessage(message)
    }

    override fun onItemClick(people: ListPeople) {
        activity?.let {
            MaterialDialog(it).show {
                title(R.string.choose_option_people)
                listItems(R.array.array_choose_option_membro) { _, index, text ->
                    val extras = Bundle()
                    extras.putSerializable("person", people)

                    when(index) {
                        0 -> {
                            loading()
                            viewModel.getPerson(people.pesCodigo)
                        }
                        1 -> {
                            var intent = Intent(activity, ObitoActivity::class.java)
                            intent.putExtras(extras)

                            startActivity(intent)
                        }
                        2 -> {
                            var intent = Intent(activity, TransferenciaActivity::class.java)
                            intent.putExtras(extras)

                            startActivity(intent)
                        }
                        3 -> {
                            var intent = Intent(activity, DesligamentoActivity::class.java)
                            intent.putExtras(extras)

                            startActivity(intent)
                        }
//                        else -> {
//                            var intent = Intent(activity, ReconciliacaoActivity::class.java)
//                            intent.putExtras(extras)
//
//                            startActivity(intent)
//                        }
                    }
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater!!.inflate(R.menu.menu_seach, menu)
        val searchItem = menu!!.findItem(R.id.action_search)
        val searchManager =
            activity!!.getSystemService(Context.SEARCH_SERVICE) as SearchManager

        if (searchItem != null) {
            searchView = searchItem.actionView as SearchView
        }
        if (searchView != null) {
            searchView!!.setSearchableInfo(searchManager.getSearchableInfo(activity!!.componentName))
            queryTextListener = object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    return false
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    if (newText != null) {
                        adapter.filter(newText)
                    }
                    return true
                }

            }
            searchView!!.setOnQueryTextListener(queryTextListener)
        }

        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item!!.itemId) {
            R.id.action_search ->
                return false
            else -> {
            }
        }
        searchView!!.setOnQueryTextListener(queryTextListener)

        return super.onOptionsItemSelected(item)
    }
}
