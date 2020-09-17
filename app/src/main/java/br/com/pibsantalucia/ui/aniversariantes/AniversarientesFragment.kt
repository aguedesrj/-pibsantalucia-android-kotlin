package br.com.pibsantalucia.ui.aniversariantes

import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.widget.ContentLoadingProgressBar
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
import br.com.pibsantalucia.ui.membros.IMembrosFragment
import br.com.pibsantalucia.ui.membros.MembrosViewModel
import br.com.pibsantalucia.utils.firebaseAnalyticsEvents
import org.antlr.v4.misc.Utils

class AniversarientesFragment: BaseFragment(), IMembrosFragment, OnItemClickCongregadoListener {

    private lateinit var constraintLayoutMessage: ConstraintLayout
    private lateinit var progressBar: ContentLoadingProgressBar
    private lateinit var button: AppCompatButton
    private lateinit var recyclerView: RecyclerView
    private lateinit var textViewMessage: TextView

    private var adapter = AniversariantesAdapter()

    companion object {
        fun newInstance() = AniversarientesFragment()
    }

    private lateinit var viewModel: AniversarientesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        adapter.listener = this

        var view: View = inflater.inflate(R.layout.aniversarientes_fragment, container, false)
        recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewAniversariantesFragment)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter
        recyclerView.visibility = View.GONE

        textViewMessage = view.findViewById(R.id.textViewAniversariantesFragmentMessage)

        constraintLayoutMessage = view.findViewById(R.id.constraintLayoutAniversariantesFragmentMessage)
        constraintLayoutMessage.visibility = View.GONE

        progressBar = view.findViewById(R.id.progressBarAniversariantesFragment)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AniversarientesViewModel()::class.java)
        viewModel.view = this

        firebaseAnalyticsEvents(requireActivity(), "Aniversariantes", "GetAniversariantes")

        this.getListAniversariantes()
    }

    private fun getListAniversariantes() {
        if (this.adapter.list != null) {
            this.adapter.list.clear()
            this.adapter.notifyDataSetChanged()
        }

        constraintLayoutMessage.visibility = View.GONE
        progressBar.visibility = View.VISIBLE
        recyclerView.visibility = View.GONE

        viewModel.listAniversariantes()
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

        adapter.list = list
        adapter.notifyDataSetChanged()
    }

    override fun failList(message: String) {
        progressBar.visibility = View.GONE
        recyclerView.visibility = View.GONE
        constraintLayoutMessage.visibility = View.VISIBLE

        textViewMessage.text = message
    }

    override fun fail(message: String) {
        this.showMessage(message)
    }

    override fun onItemClick(people: ListPeople) {
        loading()
        viewModel.getPerson(people.pesCodigo)

        firebaseAnalyticsEvents(requireActivity(), "Aniversariantes", "DetalhaMembro")
    }
}