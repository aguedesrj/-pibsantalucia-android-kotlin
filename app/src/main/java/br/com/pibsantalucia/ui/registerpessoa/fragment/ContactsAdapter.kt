package br.com.pibsantalucia.ui.registerpessoa.fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Contact
import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.adapter_contact_congregado.view.*

class ContactsAdapter(private val listContact: java.util.ArrayList<Contact>,
                      private val contactsFragment: ContactsFragment):
            RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {

    private val onClickSubject = PublishSubject.create<Contact>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsAdapter.ViewHolder {
        return ContactsAdapter.ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.adapter_contact_congregado,
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ContactsAdapter.ViewHolder, position: Int) {
        holder.bindData(listContact[position])
//        holder.itemView.setOnClickListener{
//            onClickSubject.onNext(list[position])
//        }

        var contact: Contact = listContact[position]
        holder.itemView.textViewContactType.text = contact.typeContact!!.tpcDescricao
        if (contact.ctoNumeroTelefone == null || contact.ctoNumeroTelefone == "") {
            holder.itemView.textViewContactDescription.text = contact.ctoDescricaoEmail
        } else {
            holder.itemView.textViewContactDescription.text = contact.ctoDdd + "-" + contact.ctoNumeroTelefone
        }

        holder.itemView.imageButtonContactEdit.setOnClickListener(View.OnClickListener {
            contactsFragment.pressEditContact(contact)
        })

        holder.itemView.imageButtonContactRemove.setOnClickListener(View.OnClickListener {
            contactsFragment.pressRemoveContact(contact)
        })
    }

    override fun getItemCount(): Int {
        return listContact.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindData(contact: Contact) {
            itemView.tag = contact

//            itemView.textViewContactType.text = contact.typeContact!!.tpcDescricao
//            if (contact.ctoNumeroTelefone == null || contact.ctoNumeroTelefone == "") {
//                itemView.textViewContactDescription.text = contact.ctoDescricaoEmail
//            } else {
//                itemView.textViewContactDescription.text = contact.ctoDdd + "-" + contact.ctoNumeroTelefone
//            }
//
//            itemView.imageButtonContactEdit.setOnClickListener(View.OnClickListener {
//                contactsFragment.pressEditContact(contact)
//            })
//
//            itemView.imageButtonContactRemove.setOnClickListener(View.OnClickListener {
//                contactsFragment.pressRemoveContact(contact)
//            })
        }
    }
}