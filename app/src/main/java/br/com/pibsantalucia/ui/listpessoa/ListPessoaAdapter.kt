package br.com.pibsantalucia.ui.listpessoa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.ListPeople
import com.google.common.collect.FluentIterable
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_list_people.view.*
import java.util.*
import kotlin.collections.ArrayList


class ListPessoaAdapter: RecyclerView.Adapter<ListPessoaAdapter.ViewHolder>() {

    var list: ArrayList<ListPeople> = ArrayList()
    var listFull: ArrayList<ListPeople> = ArrayList()
    var listFilter: ArrayList<ListPeople> = ArrayList()
    var listener: OnItemClickCongregadoListener?? = null
    var imageViewSetaGone: Boolean = false

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_people,
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(list[position])
        holder.itemView.setOnClickListener{
            listener!!.onItemClick(list[position])
        }

        if (this.imageViewSetaGone) {
            holder.itemView.imageViewItemListPeople.visibility = View.INVISIBLE
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindData(people: ListPeople) {
            itemView.tag = people
            itemView.textViewNameItemListPeople.text = people.pesNome?.capitalize()

            itemView.circularImageViewPhotoItemListPeople.setImageResource(R.drawable.ic_placeholder_user)
            if (people.pesFotoPath != null && people.pesFotoPath.isNotEmpty()) {
                Picasso.get()
                    .load(people.pesFotoPath)
                    .placeholder(R.drawable.ic_placeholder_user)
                    .error(R.drawable.ic_placeholder_user)
                    .into(itemView.circularImageViewPhotoItemListPeople)
            }
        }
    }

    fun filter(characterText: String) {
        var pesNome = characterText.toLowerCase(Locale.getDefault())
        listFilter.clear()
        if (pesNome.count() === 0) {
            listFilter.addAll(listFull)
        } else {
            for (person in listFull) {
                if (person.pesNome.toLowerCase(Locale.getDefault()).contains(pesNome)) {
                    listFilter.add(person)
                }
            }
        }

        list = listFilter
        notifyDataSetChanged()
    }
}