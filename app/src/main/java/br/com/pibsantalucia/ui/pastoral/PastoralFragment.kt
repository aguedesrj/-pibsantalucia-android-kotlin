package br.com.pibsantalucia.ui.pastoral

import android.graphics.Bitmap
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Pastoral
import br.com.pibsantalucia.ui.base.BaseFragment
import br.com.pibsantalucia.utils.firebaseAnalyticsEvents
import kotlinx.android.synthetic.main.pastoral_fragment.*


class PastoralFragment: BaseFragment(), IPastoralFragment {

    companion object {
        fun newInstance() = PastoralFragment()
    }

    private lateinit var viewModel: PastoralViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.pastoral_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(PastoralViewModel::class.java)
        viewModel.view = this

        pastoralWebView.settings.javaScriptEnabled = true

        progressBarPastoral.visibility = View.VISIBLE
        constraintLayoutPastoralMessage.visibility = View.GONE
        pastoralWebView.visibility = View.GONE

        firebaseAnalyticsEvents(requireActivity(), "Pastoral", "GetPastoral")

        this.viewModel.pastoral()

        this.activity?.setTitle(R.string.menu_pastoral)
    }

    override fun success(pastoral: Pastoral) {
        progressBarPastoral.visibility = View.GONE
        constraintLayoutPastoralMessage.visibility = View.GONE
        pastoralWebView.visibility = View.VISIBLE

        pastoralWebView.loadData(pastoral.pasPastoral, "text/html", "UTF-8" )
    }

    override fun fail(message: String) {
        progressBarPastoral.visibility = View.GONE
        pastoralWebView.visibility = View.GONE
        constraintLayoutPastoralMessage.visibility = View.VISIBLE

        textViewPastoralMessage.text = message
    }
}
