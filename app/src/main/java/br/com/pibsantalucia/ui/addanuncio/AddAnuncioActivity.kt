package br.com.pibsantalucia.ui.addanuncio

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.ViewModelProviders
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Anuncio
import br.com.pibsantalucia.model.Person
import br.com.pibsantalucia.ui.base.BaseActivity
import br.com.pibsantalucia.utils.hideSoftKeyBoard
import br.com.pibsantalucia.utils.isDataMaiorQueAtual
import br.com.pibsantalucia.utils.isDataValida
import kotlinx.android.synthetic.main.activity_addanuncio.*
import kotlinx.android.synthetic.main.data_personal_fragment.*

class AddAnuncioActivity: BaseActivity(), IAddAnuncioActivity {

    private lateinit var viewModel: AddAnuncioViewModel
    private var anuncio: Anuncio? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addanuncio)

        var bundle: Bundle? = this.intent.extras
        if (this.intent.hasExtra("Anuncio")) {
            anuncio = bundle!!.getSerializable("Anuncio") as Anuncio

            textInputEditTextAddAnuncio.setText(anuncio!!.anuDescricao)
            textInputEditTextAddAnuncioDateLimit.setText(anuncio!!.anuDtLimite)
        }

        val actionbar = supportActionBar
        actionbar!!.title = getString(R.string.string_title_anuncio)
        actionbar.setDisplayHomeAsUpEnabled(true)

        viewModel = ViewModelProviders.of(this).get(AddAnuncioViewModel::class.java)
        viewModel.view = this
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_save, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_save) {
            // salvar escala
            save()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun save() {
        try {
            hideSoftKeyBoard(this, textInputEditTextAddAnuncioDateLimit)

            // Data limite
            if (textInputEditTextAddAnuncioDateLimit.text?.isEmpty()!!) {
                textInputEditTextAddAnuncioDateLimit.error = getString(R.string.required_field)
            } else if (!isDataValida(textInputEditTextAddAnuncioDateLimit.text.toString())) {
                textInputEditTextAddAnuncioDateLimit.error = getString(R.string.field_date_invalid)
            }

            if (textInputEditTextAddAnuncio.text?.isEmpty()!!) {
                textInputEditTextAddAnuncio.error = getString(R.string.required_field)
            }

            if (textInputEditTextAddAnuncioDateLimit.error != null || textInputEditTextAddAnuncio.error != null) {
                return
            }

            this.loading("Salvando...")

            if (anuncio == null) {
                anuncio = Anuncio()
            }
            anuncio!!.anuDescricao = textInputEditTextAddAnuncio.text.toString()
            anuncio!!.anuDtLimite = textInputEditTextAddAnuncioDateLimit.text.toString()

            viewModel.save(anuncio!!)
        } catch (e: Exception) {
            this.hideLoading()
            this.showMessage(getString(R.string.error_message_system_not_available))
        }
    }

    override fun success(message: String) {
        this.hideLoading()

        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage(message)
        alertDialogBuilder.setTitle("")
        alertDialogBuilder
            .setCancelable(false)
            .setNegativeButton(resources.getString(R.string.dialog_neutral_button)) { dialog, _ ->
                finish()
            }

        val alertD = alertDialogBuilder.create()
        alertD.show()
    }

    override fun fail(message: String) {
        this.showMessage(message)
    }
}