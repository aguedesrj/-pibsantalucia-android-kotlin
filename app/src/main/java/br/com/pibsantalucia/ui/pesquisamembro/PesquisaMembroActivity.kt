package br.com.pibsantalucia.ui.pesquisamembro

import android.app.Activity
import android.app.SearchManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.widget.SearchView
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Escala
import br.com.pibsantalucia.model.ListPeople
import br.com.pibsantalucia.ui.base.BaseActivity
import br.com.pibsantalucia.ui.base.BaseFragment
import br.com.pibsantalucia.ui.listpessoa.ListPessoaAdapter
import br.com.pibsantalucia.ui.listpessoa.OnItemClickCongregadoListener
import br.com.pibsantalucia.ui.membros.IMembrosFragment
import kotlinx.android.synthetic.main.activity_pesquisa_membro.*

class PesquisaMembroActivity: BaseActivity(), OnItemClickCongregadoListener {

    private var adapter = ListPessoaAdapter()
    private var searchView: SearchView? = null
    private var queryTextListener: SearchView.OnQueryTextListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesquisa_membro)

        val actionbar = supportActionBar
        actionbar!!.title = "Pesquisa Membro"
        actionbar.setDisplayHomeAsUpEnabled(true)

        var list: ArrayList<ListPeople> = intent.getSerializableExtra("ListPeople") as ArrayList<ListPeople>

        adapter.listener = this
        adapter.list = list
        adapter.listFull = list
        adapter.imageViewSetaGone = true

        recyclerViewPesquisaMembro.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_seach, menu)

        val searchItem = menu!!.findItem(R.id.action_search)
        val searchManager =
            getSystemService(Context.SEARCH_SERVICE) as SearchManager

        if (searchItem != null) {
            searchView = searchItem.actionView as SearchView
        }
        if (searchView != null) {
            searchView!!.setSearchableInfo(searchManager.getSearchableInfo(componentName))
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

        return super.onCreateOptionsMenu(menu)
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

    override fun onItemClick(person: ListPeople) {
        val result = Intent()
        result.putExtra("MEMBRO", person)

        setResult(Activity.RESULT_OK, result)

        this.onBackPressed()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}