package br.com.pibsantalucia.ui.reconciliacao

import android.app.AlertDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import android.view.MenuItem
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProviders
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Desligamento
import br.com.pibsantalucia.model.ListPeople
import br.com.pibsantalucia.model.Reconciliacao
import br.com.pibsantalucia.ui.base.BaseActivity
import br.com.pibsantalucia.ui.desligamento.DesligamentoViewModel
import br.com.pibsantalucia.utils.hideSoftKeyBoard
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_desligamento.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_obito.*
import kotlinx.android.synthetic.main.activity_reconciliacao.*

class ReconciliacaoActivity: BaseActivity(), IReconciliacaoActivity {

    private lateinit var model: ReconciliacaoViewModel
    private lateinit var person: ListPeople

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reconciliacao)

        val actionbar = supportActionBar
        actionbar!!.title = "Reconciliação"
        actionbar.setDisplayHomeAsUpEnabled(true)

        person = this.intent.extras!!.getSerializable("person") as ListPeople

        textViewNameReconciliacao.setText(person.pesNome)
        Picasso.get()
            .load(person.pesFotoPath)
            .placeholder(R.drawable.ic_placeholder_user)
            .error(R.drawable.ic_placeholder_user)
            .into(circularImageViewPhotoReconciliacao)

        editTextReconciliacaoDate.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            @RequiresApi(Build.VERSION_CODES.M)
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                textInputLayoutReconciliacaoDate.error = null
            }
            override fun afterTextChanged(editable: Editable) {}
        })
    }

    override fun onStart() {
        super.onStart()

        model = ViewModelProviders.of(this).get(ReconciliacaoViewModel::class.java)
        model.view = this
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_save, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.action_save) {
            // salvar
            save()
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun save() {
        try {
            hideSoftKeyBoard(this, editTextReconciliacaoDate)

            var reconciliacao: Reconciliacao = Reconciliacao()
            reconciliacao.pesCodigo = person.pesCodigo
            reconciliacao.recDtReconciliacao = editTextReconciliacaoDate.text.toString()
            reconciliacao.recObservacao = textInputEditTextReconciliacaoObs.text.toString().trim()

            // salvar
            model.save(reconciliacao)
        } catch (e: Exception) {
            this.hideLoading()
            this.showMessage(getString(R.string.error_message_system_not_available))
        }
    }

    override fun showErrorData(message: Int) {
        this.hideLoading()
        textInputLayoutReconciliacaoDate.error = getString(message)
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
