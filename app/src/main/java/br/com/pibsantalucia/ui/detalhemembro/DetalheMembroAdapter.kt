package br.com.pibsantalucia.ui.detalhemembro

import android.opengl.Visibility
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Contact
import br.com.pibsantalucia.ui.listpessoa.OnItemClickCongregadoListener
import kotlinx.android.synthetic.main.item_detalhe_membro.view.*

class DetalheMembroAdapter: RecyclerView.Adapter<DetalheMembroAdapter.ViewHolder>() {

    var list: ArrayList<Contact> = ArrayList()
    var listener: OnItemClickContact?? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetalheMembroAdapter.ViewHolder {
        return DetalheMembroAdapter.ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_detalhe_membro,
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: DetalheMembroAdapter.ViewHolder, position: Int) {
        holder.bindData(list[position])
        holder.itemView.imageButtonItemDetalheMembroWhatsApp.setOnClickListener() {
            listener!!.onItemClickWhatsApp(list[position])
        }
        holder.itemView.imageButtonItemDetalheMembroPhone.setOnClickListener() {
            listener!!.onItemClickPhone(list[position])
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindData(contact: Contact) {
            itemView.tag = contact

            var contato: String = ""
            if (contact.typeContact!!.tpcCodigo == 1) {
                contato = contato + contact.ctoDescricaoEmail
            } else {
                contato = contato + "(" + contact.ctoDdd + ") " + contact.ctoNumeroTelefone
            }

            itemView.textViewItemDetalheMembroPhone.text = contato
            itemView.imageButtonItemDetalheMembroWhatsApp.visibility = View.GONE
            if (contact.typeContact!!.tpcCodigo == 2) {
                itemView.imageButtonItemDetalheMembroWhatsApp.visibility = View.VISIBLE
            }
        }
    }
}