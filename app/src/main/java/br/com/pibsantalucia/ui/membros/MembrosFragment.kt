package br.com.pibsantalucia.ui.membros

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
import br.com.pibsantalucia.PibSantaLuciaApplication
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.ListPeople
import br.com.pibsantalucia.model.Person
import br.com.pibsantalucia.model.User
import br.com.pibsantalucia.ui.base.BaseFragment
import br.com.pibsantalucia.ui.detalhefullmembro.DetalheFullMembroActivity
import br.com.pibsantalucia.ui.detalhemembro.DetalheMembroActivity
import br.com.pibsantalucia.ui.listpessoa.ListPessoaAdapter
import br.com.pibsantalucia.ui.listpessoa.OnItemClickCongregadoListener
import br.com.pibsantalucia.utils.firebaseAnalyticsEvents
import br.com.pibsantalucia.utils.hideSoftKeyBoard


class MembrosFragment: BaseFragment(), IMembrosFragment, OnItemClickCongregadoListener {

    private lateinit var constraintLayoutMessage: ConstraintLayout
    private lateinit var progressBar: ContentLoadingProgressBar
    private lateinit var button: AppCompatButton
    private lateinit var recyclerView: RecyclerView
    private lateinit var textViewMessage: TextView

    private var adapter = ListPessoaAdapter()
    private var searchView: SearchView? = null
    private var queryTextListener: SearchView.OnQueryTextListener? = null

    companion object {
        fun newInstance() = MembrosFragment()
    }

    private lateinit var viewModel: MembrosViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        adapter.listener = this

        var view: View = inflater.inflate(R.layout.membros_fragment, container, false)
        recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewMembrosFragment)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter
        recyclerView.visibility = View.GONE

        textViewMessage = view.findViewById(R.id.textViewMembrosFragmentMessage)

        constraintLayoutMessage = view.findViewById(R.id.constraintLayoutMembrosFragmentMessage)
        constraintLayoutMessage.visibility = View.GONE

        progressBar = view.findViewById(R.id.progressBarMembrosFragment)
        button = view.findViewById(R.id.buttonMembrosFragment)

        setHasOptionsMenu(true)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MembrosViewModel()::class.java)
        viewModel.view = this

        firebaseAnalyticsEvents(requireActivity(), "Membros", "GetLista")

        this.getListMembros()

        button.setOnClickListener(View.OnClickListener {
            getListMembros()
        })
    }

    private fun getListMembros() {
        if (this.adapter.list != null) {
            this.adapter.list.clear()
            this.adapter.listFull.clear()
            this.adapter.notifyDataSetChanged()
        }

        constraintLayoutMessage.visibility = View.GONE
        progressBar.visibility = View.VISIBLE
        recyclerView.visibility = View.GONE

        viewModel.listPeoples()
    }

    override fun success(person: Person) {
        this.hideLoading()

        var user: User = PibSantaLuciaApplication.database?.userDao()?.getUser()!!

        val extras = Bundle()
        extras.putSerializable("person", person)

        if (person.pesCodigo != user.pesCodigo) {
            var intent = Intent(activity, DetalheMembroActivity::class.java)
            intent.putExtras(extras)

            startActivity(intent)
        } else {
            var intent = Intent(activity, DetalheFullMembroActivity::class.java)
            intent.putExtras(extras)

            startActivity(intent)
        }
    }

    override fun success(list: ArrayList<ListPeople>) {
        progressBar.visibility = View.GONE
        constraintLayoutMessage.visibility = View.GONE
        recyclerView.visibility = View.VISIBLE

        var listFilter: ArrayList<ListPeople> = ArrayList()
        // prepara resumo
        for (people in list) {
            if (people.pesFglMembro) {
                listFilter.add(people)
            }
        }

        adapter.list = listFilter
        adapter.listFull = listFilter
        adapter.notifyDataSetChanged()
    }

    override fun failList(message: String) {
        progressBar.visibility = View.GONE
        recyclerView.visibility = View.GONE
        constraintLayoutMessage.visibility = View.VISIBLE

        textViewMessage.text = getString(R.string.msg_error_try_again)
    }

    override fun fail(message: String) {
        this.showMessage(message)
    }

    override fun onItemClick(people: ListPeople) {
        hideSoftKeyBoard(view!!)

        loading()
        viewModel.getPerson(people.pesCodigo)
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
