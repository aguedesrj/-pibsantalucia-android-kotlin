package br.com.pibsantalucia.ui.registerpessoa.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Contact
import br.com.pibsantalucia.model.Person
import br.com.pibsantalucia.model.TypeContact
import br.com.pibsantalucia.ui.base.BaseFragment
import br.com.pibsantalucia.utils.isCampoPreenchido
import com.afollestad.materialdialogs.MaterialDialog
import kotlinx.android.synthetic.main.contacts_fragment.*
import java.util.*

class ContactsFragment: BaseFragment() {

    companion object {
        fun newInstance() = ContactsFragment()
    }

    private lateinit var viewModel: ContactsViewModel

    private var contactsAdapter: ContactsAdapter?? = null
    private var typeContactSelected: TypeContact?? = null
    private var listContact: ArrayList<Contact>? = null
    private var contactAlter: Contact?? = null
    private var listContactRemove: ArrayList<Contact>?? = null

    var person: Person?? = null
    var listTypeContacts: ArrayList<TypeContact>?? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.contacts_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ContactsViewModel::class.java)

        init()
    }

    private fun init() {

        // verifica se está alterando.
        if (person!!.pesCodigo > 0) {
            this.assignValuesToScreen()
        }

        if (listContact == null) {
            listContact = ArrayList<Contact>()
        }

        constraintLayoutContact.visibility = View.GONE
        textInputLayoutCongregadoEmail.visibility = View.GONE
        viewLineCongregadoContact.visibility = View.GONE
        buttonCongregadoContactAdd.visibility = View.GONE

        // Configurando o gerenciador de layout para ser uma lista.
        recyclerViewCongregadoContact.layoutManager = LinearLayoutManager(this.context)
        recyclerViewCongregadoContact.setHasFixedSize(true)

        // Adiciona o adapter que irá anexar os objetos à lista.
        // Está sendo criado com lista vazia, pois será preenchida posteriormente.
        contactsAdapter = ContactsAdapter(listContact!!, this)
        recyclerViewCongregadoContact.adapter = contactsAdapter

        // Configurando um dividr entre linhas, para uma melhor visualização.
        recyclerViewCongregadoContact.addItemDecoration(
            DividerItemDecoration(
                this.context,
                DividerItemDecoration.VERTICAL
            )
        )

        // adicionar o selecione...
        val typeContactSelect = arrayOf(TypeContact())
        typeContactSelect[0].tpcCodigo = 0
        typeContactSelect[0].tpcDescricao = ":: Selecione Tipo de Contato ::"
        listTypeContacts!!.add(0, typeContactSelect[0])

        val items = arrayOfNulls<String>(listTypeContacts!!.size)
        var i = 0
        while (listTypeContacts!!.size > i) {
            val typeContact = listTypeContacts!![i]
            items.run {
                set(i, typeContact.tpcDescricao)
            }
            i++
        }

        val adapter = ArrayAdapter(this.context!!, android.R.layout.simple_list_item_1, items)
        adapter.setDropDownViewResource(R.layout.custom_spinner_dropdown_item)
        spinnerCongregadoTypeContact.adapter = adapter

        spinnerCongregadoTypeContact.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(adapter: AdapterView<*>?) {
                //
            }

            override fun onItemSelected(adapter: AdapterView<*>?, view: View?, position: Int, id: Long) {
                when (position) {
                    0 -> {
                        constraintLayoutContact.visibility = View.GONE
                        textInputLayoutCongregadoEmail.visibility = View.GONE
                        viewLineCongregadoContact.visibility = View.GONE
                        buttonCongregadoContactAdd.visibility = View.GONE
                    }
                    1 -> {
                        constraintLayoutContact.visibility = View.GONE
                        textInputLayoutCongregadoEmail.visibility = View.VISIBLE
                        viewLineCongregadoContact.visibility = View.VISIBLE
                        buttonCongregadoContactAdd.visibility = View.VISIBLE

                        textInputEditTextCongregadoEmail.requestFocus()
                    }
                    else -> {
                        constraintLayoutContact.visibility = View.VISIBLE
                        textInputLayoutCongregadoEmail.visibility = View.GONE
                        viewLineCongregadoContact.visibility = View.VISIBLE
                        buttonCongregadoContactAdd.visibility = View.VISIBLE
                        
                        textInputEditTextCongregadoDdd.requestFocus()
                    }
                }

                val selectedItem = spinnerCongregadoTypeContact.adapter.getItem(position).toString()
                for (typeContact in listTypeContacts!!) {
                    if (typeContact.tpcDescricao.trim { it <= ' ' }.toUpperCase() == selectedItem.trim { it <= ' ' }.toUpperCase()) {
                        typeContactSelected = typeContact
                        typeContactSelected!!.position = position
                        break
                    }
                }
            }
        }

        buttonCongregadoContactAdd.setOnClickListener(View.OnClickListener {
            // validar campos
            if (typeContactSelected == null || typeContactSelected!!.tpcCodigo == 0) {
                this.showMessage(getResources().getString(R.string.required_type_contact))
                return@OnClickListener
            }

            if (typeContactSelected!!.tpcCodigo == 1 && textInputEditTextCongregadoEmail.text.toString().trim { it <= ' ' } == "") {
                textInputEditTextCongregadoEmail.error =
                    resources.getString(R.string.required_field)
                return@OnClickListener
            }

            if (typeContactSelected!!.tpcCodigo > 1) {
                if (textInputEditTextCongregadoDdd.text.toString().trim { it <= ' ' } == "") {
                    textInputEditTextCongregadoDdd.error =
                        resources.getString(R.string.required_field)
                    return@OnClickListener
                }
                if (textInputEditTextCongregadoPhone.text.toString().trim { it <= ' ' } == "") {
                    textInputEditTextCongregadoPhone.error =
                        resources.getString(R.string.required_field)
                    return@OnClickListener
                }
            }

            // verifica se é novo contato...
            if (contactAlter == null) {
                val contact = Contact()
                contact.ctoCodigo = Random().nextLong()
                contact.newContact = true
                contact.typeContact = typeContactSelected
                contact.localOnly = true
                contact.ctoDescricaoEmail = null
                contact.ctoDdd = null
                contact.ctoNumeroTelefone = null
                if (typeContactSelected!!.tpcCodigo > 1) { // telefone
                    contact.ctoDdd = textInputEditTextCongregadoDdd.text.toString().trim { it <= ' ' }
                    contact.ctoNumeroTelefone = textInputEditTextCongregadoPhone.text.toString().trim { it <= ' ' }
                } else { // email
                    contact.ctoDescricaoEmail = textInputEditTextCongregadoEmail.text.toString().trim { it <= ' ' }
                }
                listContact!!.add(contact)
            } else {
                for (contact in listContact!!) {
                    if (contact.ctoCodigo == contactAlter!!.ctoCodigo) { // novo contato
                        contact.typeContact = typeContactSelected
                        contact.ctoDescricaoEmail = null
                        contact.ctoDdd = null
                        contact.ctoNumeroTelefone = null
                        if (contactAlter!!.typeContact!!.tpcCodigo > 1) { // telefone
                            contact.ctoDdd = textInputEditTextCongregadoDdd.text.toString().trim { it <= ' ' }
                            contact.ctoNumeroTelefone = textInputEditTextCongregadoPhone.text.toString().trim { it <= ' ' }
                        } else { // email
                            contact.ctoDescricaoEmail = textInputEditTextCongregadoEmail.text.toString().trim { it <= ' ' }
                        }
                        break
                    }
                }
                contactAlter = null
            }
            contactsAdapter!!.notifyDataSetChanged()
        })
    }

    fun pressEditContact(contact: Contact) {
        contactAlter = contact
        spinnerCongregadoTypeContact.setSelection(contact.typeContact!!.position)
        if (contactAlter!!.ctoDescricaoEmail != null) {
            constraintLayoutContact.visibility = View.GONE
            textInputLayoutCongregadoEmail.visibility = View.VISIBLE
            textInputEditTextCongregadoEmail.setText(contactAlter!!.ctoDescricaoEmail)
            textInputEditTextCongregadoEmail.requestFocus()
        } else {
            constraintLayoutContact.visibility = View.VISIBLE
            textInputLayoutCongregadoEmail.visibility = View.GONE
            textInputEditTextCongregadoDdd.setText(contactAlter!!.ctoDdd)
            textInputEditTextCongregadoPhone.setText(contactAlter!!.ctoNumeroTelefone)
            textInputEditTextCongregadoDdd.requestFocus()
        }
    }

    fun pressRemoveContact(contact: Contact) {
        MaterialDialog(requireContext()).show {
            title(R.string.app_name)
            message(R.string.question_remove_contact)
            positiveButton(R.string.text_confirm) { dialog ->
                for (contac in listContact!!) {
                    if (contac.ctoCodigo == contact.ctoCodigo) {
                        // verifica se foi incluído localmente.
                        if (contac.localOnly != null && contac.localOnly) {
                            listContact!!.remove(contac)
                        } else {
                            contac.removeContact = true
                            if (listContactRemove == null) {
                                listContactRemove = ArrayList<Contact>()
                            }
                            listContactRemove!!.add(contac)
                            listContact!!.remove(contac)
                        }
                        contactsAdapter!!.notifyDataSetChanged()
                        break
                    }
                }
            }
            negativeButton(R.string.text_close)
            lifecycle
        }
    }

    fun assignValuesToPerson(): Person {
        person!!.listContact = ArrayList()
        // adiciona os contatos
        if (listContact != null && listContact!!.size > 0) {
            person!!.listContact!!.addAll(listContact!!)
        }
        // remover os contatos excluidos.
        if (listContactRemove != null && listContactRemove!!.size > 0) {
            person!!.listContact!!.addAll(listContactRemove!!)
        }
        return person!!
    }

    private fun assignValuesToScreen() {
        if (person!!.listContact != null) {
            listContact = person!!.listContact!!
            for (contact in listContact!!) {
                var i = 0
                while (listTypeContacts!!.size > i) {
                    val typeContact = listTypeContacts!![i]
                    if (contact.typeContact!!.tpcCodigo == typeContact.tpcCodigo) {
                        contact.typeContact!!.position = i + 1
                        break
                    }
                    i++
                }
            }
        } else {
            listContact = ArrayList<Contact>()
        }
    }
}
