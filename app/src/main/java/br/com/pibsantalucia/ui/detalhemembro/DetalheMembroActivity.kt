package br.com.pibsantalucia.ui.detalhemembro

import android.Manifest
import android.app.AlertDialog
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Contact
import br.com.pibsantalucia.model.Person
import br.com.pibsantalucia.ui.base.BaseActivity
import br.com.pibsantalucia.utils.firebaseAnalyticsEvents
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detalhe_membro.*
import java.net.URLEncoder


class DetalheMembroActivity: BaseActivity(), IDetalheMembroActivity, OnItemClickContact {

    private lateinit var person: Person
    private var adapter = DetalheMembroAdapter()
    private lateinit var contactSelected: Contact

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_membro)

        adapter.listener = this

        recyclerViewTelefones.layoutManager = LinearLayoutManager(this)
        recyclerViewTelefones.adapter = adapter

        var bundle: Bundle? = this.intent.extras
        person = bundle!!.getSerializable("person") as Person

        var pesNome = person.pesNome
        val parts = pesNome!!.split(" ")

        val actionbar = supportActionBar
        actionbar!!.title = parts[0] + " " + parts[parts.count()-1]
        actionbar.setDisplayHomeAsUpEnabled(true)

        textViewDetalheMembroNome.text = pesNome
        textViewDetalheMembroAniversario.text = person.dtAniversarioFmt
        textViewDetalheMembroEndereco.text = person.enderecoCompleto

        if (person.listContact != null && person.listContact!!.count() > 0) {
            var listContacts: ArrayList<Contact> = ArrayList()
            for (contact: Contact in this.person.listContact!!) {
                if (contact.typeContact != null && (contact.typeContact!!.tpcCodigo == 2 || contact.typeContact!!.tpcCodigo == 3 || contact.typeContact!!.tpcCodigo == 4)) {
                    listContacts.add(contact)
                }
            }

            if (listContacts.count() > 0) {
                adapter.list = listContacts
                adapter.notifyDataSetChanged()
            }
        }

        imageViewDetalheMembroBg.setImageResource(R.drawable.ic_placeholder_user)
        circularImageViewDetalheMembro.setImageResource(R.drawable.ic_placeholder_user)
        if (person.pesFotoPath != null && person.pesFotoPath != "") {
            Picasso.get()
                .load(person.pesFotoPath)
                .placeholder(R.drawable.ic_placeholder_user)
                .error(R.drawable.ic_placeholder_user)
                .into(circularImageViewDetalheMembro)

            Picasso.get()
                .load(person.pesFotoPath)
                .placeholder(R.drawable.ic_placeholder_user)
                .error(R.drawable.ic_placeholder_user)
                .into(imageViewDetalheMembroBg)
        }

        firebaseAnalyticsEvents(this, "Detalhamento", "GetMembro")
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onItemClickWhatsApp(contact: Contact) {
        this.contactSelected = contact
        val phone: String = "55 "+contact.ctoDdd+" "+contact.ctoNumeroTelefone
        try {
            val intent = Intent(Intent.ACTION_VIEW)
            val url = "https://api.whatsapp.com/send?phone=$phone"
            intent.setPackage("com.whatsapp")
            intent.data = Uri.parse(url)
            startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(this, getString(R.string.error_call_whatsapp), Toast.LENGTH_SHORT).show()
        }
    }

    override fun onItemClickPhone(contact: Contact) {
        this.contactSelected = contact
        try {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                callPhone()
            } else {
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), 990)
            }
        } catch (e: Exception) {
            Toast.makeText(this, getString(R.string.error_call_phone), Toast.LENGTH_SHORT).show()
        }
    }

    private fun callPhone() {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage("Deseja realizar a ligação?")
        alertDialogBuilder
            .setCancelable(false)
            .setPositiveButton(resources.getString(R.string.dialog_button_yes)) { dialog, id ->
                var phone: String = contactSelected.ctoDdd + contactSelected.ctoNumeroTelefone

                val sendIntent = Intent(Intent.ACTION_DIAL)
                sendIntent.setData(Uri.parse("tel:"+phone))
                startActivity(sendIntent)
            }
            .setNegativeButton(resources.getString(R.string.dialog_button_no)) { dialog, id ->
                // default
            }

        val alertD = alertDialogBuilder.create()
        alertD.show()
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            if (grantResults.count() > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                callPhone()
            } else {
                Toast.makeText(this, getString(R.string.not_permission_call_phone), Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, getString(R.string.not_permission_call_phone), Toast.LENGTH_SHORT).show()
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }
}
