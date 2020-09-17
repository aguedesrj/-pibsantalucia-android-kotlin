package br.com.pibsantalucia.ui.escala

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Escala
import br.com.pibsantalucia.model.ListPeople
import br.com.pibsantalucia.utils.isPerfilSecretaria
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.escala_child_adapter.view.*

class EscalaChildAdapter: RecyclerView.Adapter<EscalaChildAdapter.ViewHolder>() {

    var escala: Escala = Escala()
    var listener: OnClickEscalaChildListener?? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.escala_child_adapter,
                parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return escala.lista.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(escala.lista[position])

        holder.itemView.imageButtonRemoveEscalaChild.setOnClickListener(View.OnClickListener {
            listener!!.onItemClick(escala, escala.lista[position])
        })

        holder.itemView.buttonAddEscalaChild.setOnClickListener(View.OnClickListener {
            listener!!.onItemClick(escala.lista[position])
        })

        if (!isPerfilSecretaria()) {
            holder.itemView.imageButtonRemoveEscalaChild.visibility = View.GONE
        }
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindData(people: ListPeople) {

            itemView.textViewAddEscalaChildName.text = people.pesNome
            itemView.circularImageViewPhotoAddEscalaChild.setImageResource(R.drawable.ic_placeholder_user)
            if (people.pesFotoPath != null && people.pesFotoPath.isNotEmpty()) {
                Picasso.get()
                    .load(people.pesFotoPath)
                    .placeholder(R.drawable.ic_placeholder_user)
                    .error(R.drawable.ic_placeholder_user)
                    .into(itemView.circularImageViewPhotoAddEscalaChild)
            }
        }
    }
}