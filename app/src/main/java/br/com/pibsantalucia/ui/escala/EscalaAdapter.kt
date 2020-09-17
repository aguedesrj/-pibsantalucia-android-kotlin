package br.com.pibsantalucia.ui.escala

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Escala
import br.com.pibsantalucia.model.ListPeople
import br.com.pibsantalucia.utils.isPerfilSecretaria
import kotlinx.android.synthetic.main.escala_adapter.view.*


class EscalaAdapter: RecyclerView.Adapter<EscalaAdapter.ViewHolder>(),
    OnClickEscalaChildListener {

    var list: ArrayList<Escala> = ArrayList()
    var listener: OnClickEscalaListener?? = null

    var adapterChild: EscalaChildAdapter =
        EscalaChildAdapter()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.escala_adapter,
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(list[position])
        holder.itemView.imageButtonAddEscalaAdapter.setOnClickListener(View.OnClickListener {
            listener!!.onItemClick(list[position])
            notifyDataSetChanged()
        })

        adapterChild = EscalaChildAdapter()
        adapterChild.escala = list.get(position)
        adapterChild.listener = this

        holder.itemView.childRecyclerView.adapter = adapterChild

        if (!isPerfilSecretaria()) {
            holder.itemView.imageButtonAddEscalaAdapter.visibility = View.INVISIBLE
        }

        if (list.get(position).lista != null && list.get(position).lista.count() > 0) {
            holder.itemView.constraintLayoutEscalaAdapterNoMembro.visibility = View.GONE
        } else {
            holder.itemView.constraintLayoutEscalaAdapterNoMembro.visibility = View.VISIBLE
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindData(escala: Escala) {

            itemView.textViewAddEscalaDescription.text = escala.escDescricao + " (" + escala.escDtEscala + ")"
        }
    }

    override fun onItemClick(escala: Escala, membro: ListPeople) {
        for (escalaThis in list) {
            if (escalaThis.escDtEscala == escala.escDtEscala) {
                for (people in escalaThis.lista) {
                    if (people.pesCodigo == membro.pesCodigo) {
                        escalaThis.lista.remove(membro)
                        listener!!.notifyDataSetChanged()
                        break
                    }
                }
            }
        }
    }

    override fun onItemClick(membro: ListPeople) {
        listener!!.onItemClick(membro)
    }
}