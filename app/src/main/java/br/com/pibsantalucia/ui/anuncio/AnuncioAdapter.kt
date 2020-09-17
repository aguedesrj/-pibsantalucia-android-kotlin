package br.com.pibsantalucia.ui.anuncio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Anuncio
import br.com.pibsantalucia.model.ListPeople
import br.com.pibsantalucia.ui.aniversariantes.AniversariantesAdapter
import br.com.pibsantalucia.ui.listpessoa.OnItemClickCongregadoListener
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_aniversariantes.view.*
import kotlinx.android.synthetic.main.item_anuncio.view.*

class AnuncioAdapter: RecyclerView.Adapter<AnuncioAdapter.ViewHolder>() {

    var list: ArrayList<Anuncio> = ArrayList()
    var listener: OnItemClickAnuncio?? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_anuncio,
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(list[position])
        holder.itemView.setOnClickListener{
            listener!!.onItemClick(list[position])
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindData(anuncio: Anuncio) {
            itemView.tag = anuncio

            itemView.textViewItemAnuncio.text = anuncio.anuDescricao
        }
    }
}