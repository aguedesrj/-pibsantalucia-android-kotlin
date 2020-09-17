package br.com.pibsantalucia.ui.desligamento

import android.app.AlertDialog
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProviders
import br.com.pibsantalucia.MainActivity
import br.com.pibsantalucia.PibSantaLuciaApplication
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Desligamento
import br.com.pibsantalucia.model.ListPeople
import br.com.pibsantalucia.ui.base.BaseActivity
import br.com.pibsantalucia.ui.changepassword.ChangePasswordActivity
import br.com.pibsantalucia.ui.login.LoginViewModel
import br.com.pibsantalucia.utils.hideSoftKeyBoard
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_desligamento.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_obito.*

class DesligamentoActivity: BaseActivity(), IDesligamentoActivity {

    private lateinit var model: DesligamentoViewModel
    private lateinit var person: ListPeople

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desligamento)

        val actionbar = supportActionBar
        actionbar!!.title = "Desligamento"
        actionbar.setDisplayHomeAsUpEnabled(true)

        person = this.intent.extras!!.getSerializable("person") as ListPeople

        textViewNameDesligamento.setText(person.pesNome)
        Picasso.get()
            .load(person.pesFotoPath)
            .placeholder(R.drawable.ic_placeholder_user)
            .error(R.drawable.ic_placeholder_user)
            .into(circularImageViewPhotoDesligamento)

        editTextDesligamentoDate.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            @RequiresApi(Build.VERSION_CODES.M)
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                textInputLayoutDesligamentoDate.error = null
            }
            override fun afterTextChanged(editable: Editable) {}
        })
    }

    override fun onStart() {
        super.onStart()

        model = ViewModelProviders.of(this).get(DesligamentoViewModel::class.java)
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
            hideSoftKeyBoard(this, editTextDesligamentoDate)

            var desligamento: Desligamento = Desligamento()
            desligamento.pesCodigo = person.pesCodigo
            desligamento.desDtDesligamento = editTextDesligamentoDate.text.toString()
            desligamento.desObservacao = textInputEditTextDesligamentoObs.text.toString().trim()

            // salvar
            model.save(desligamento)
        } catch (e: Exception) {
            this.hideLoading()
            this.showMessage(getString(R.string.error_message_system_not_available))
        }
    }

    override fun showErrorData(message: Int) {
        this.hideLoading()
        textInputLayoutDesligamentoDate.error = getString(message)
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
