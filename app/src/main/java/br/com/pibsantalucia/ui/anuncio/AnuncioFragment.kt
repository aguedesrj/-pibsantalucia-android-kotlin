package br.com.pibsantalucia.ui.anuncio

import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.widget.ContentLoadingProgressBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Anuncio
import br.com.pibsantalucia.ui.addanuncio.AddAnuncioActivity
import br.com.pibsantalucia.ui.aniversariantes.AniversariantesAdapter
import br.com.pibsantalucia.ui.base.BaseFragment
import br.com.pibsantalucia.ui.detalhefullmembro.DetalheFullMembroActivity
import br.com.pibsantalucia.utils.firebaseAnalyticsEvents
import br.com.pibsantalucia.utils.isPerfilSecretaria

class AnuncioFragment: BaseFragment(), IAnuncioFragment, OnItemClickAnuncio {

    private lateinit var constraintLayoutMessage: ConstraintLayout
    private lateinit var progressBar: ContentLoadingProgressBar
    private lateinit var button: AppCompatButton
    private lateinit var textViewMessage: TextView
    private lateinit var recyclerView: RecyclerView

    private var adapter = AnuncioAdapter()

    companion object {
        fun newInstance() = AnuncioFragment()
    }

    private lateinit var viewModel: AnuncioViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.anuncio_fragment, container, false)

        adapter.listener = this

        recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewAnuncio)
        recyclerView.adapter = adapter
        recyclerView.visibility = View.GONE

        textViewMessage = view.findViewById(R.id.textViewAnuncioFragmentMessage)

        constraintLayoutMessage = view.findViewById(R.id.constraintLayoutAnuncioFragmentMessage)
        constraintLayoutMessage.visibility = View.GONE

        progressBar = view.findViewById(R.id.progressBarAnuncioFragment)

        setHasOptionsMenu(true)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AnuncioViewModel::class.java)
        viewModel.view = this
    }

    override fun onStart() {
        super.onStart()

        firebaseAnalyticsEvents(requireActivity(), "Anuncio", "Lista")

        this.getLista()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        if (isPerfilSecretaria()) {
            inflater!!.inflate(R.menu.menu_new, menu)
        }
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_new) {
            startActivity(Intent(activity, AddAnuncioActivity::class.java))
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun getLista() {
        if (this.adapter.list != null) {
            this.adapter.list.clear()
            this.adapter.notifyDataSetChanged()
        }

        constraintLayoutMessage.visibility = View.GONE
        progressBar.visibility = View.VISIBLE
        recyclerView.visibility = View.GONE

        viewModel.list()
    }

    override fun success(lista: ArrayList<Anuncio>) {
        progressBar.visibility = View.GONE
        constraintLayoutMessage.visibility = View.GONE
        recyclerView.visibility = View.VISIBLE

        adapter.list = lista
        adapter.notifyDataSetChanged()
    }

    override fun fail(message: String) {
        progressBar.visibility = View.GONE
        recyclerView.visibility = View.GONE
        constraintLayoutMessage.visibility = View.VISIBLE

        textViewMessage.text = message
    }

    override fun onItemClick(anuncio: Anuncio) {
        if (isPerfilSecretaria()) {
            val extras = Bundle()
            extras.putSerializable("Anuncio", anuncio)

            var intent = Intent(activity, AddAnuncioActivity::class.java)
            intent.putExtras(extras)

            startActivity(intent)
        }
    }
}