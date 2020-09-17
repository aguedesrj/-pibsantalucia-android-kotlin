package br.com.pibsantalucia.ui.aniversariantes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.ListPeople
import br.com.pibsantalucia.ui.listpessoa.ListPessoaAdapter
import br.com.pibsantalucia.ui.listpessoa.OnItemClickCongregadoListener
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_aniversariantes.view.*
import kotlinx.android.synthetic.main.item_list_people.view.*

class AniversariantesAdapter: RecyclerView.Adapter<AniversariantesAdapter.ViewHolder>() {

    var list: ArrayList<ListPeople> = ArrayList()
    var listener: OnItemClickCongregadoListener?? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_aniversariantes,
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
        fun bindData(people: ListPeople) {
            itemView.tag = people

            var pesNome: String = people.pesNome?.capitalize()
            pesNome = pesNome + "\n" + people.dtAniversarioFmt
            itemView.textViewNameItemAniversariantes.text = pesNome

            itemView.circularImageViewPhotoItemAniversariantes.setImageResource(R.drawable.ic_placeholder_user)
            if (people.pesFotoPath != null && people.pesFotoPath.isNotEmpty()) {
                Picasso.get()
                    .load(people.pesFotoPath)
                    .placeholder(R.drawable.ic_placeholder_user)
                    .error(R.drawable.ic_placeholder_user)
                    .into(itemView.circularImageViewPhotoItemAniversariantes)
            }
        }
    }
}