package com.example.miniprojectmobile.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.miniprojectmobile.KulinerItem
import com.example.miniprojectmobile.R
import kotlinx.android.synthetic.main.item_home.view.*

class HomeAdapter(private val listMakanan: ArrayList<KulinerItem>, val listener: OnItemClickListener) : RecyclerView.Adapter<HomeAdapter.Homeholder>() {

    interface OnItemClickListener{
        fun onClick(kulinerItem: KulinerItem)
    }

    class Homeholder(itemview: View): RecyclerView.ViewHolder(itemview){
        fun bind(kulinerItem: KulinerItem, listener: OnItemClickListener){
            with(itemView){
                nama.text = kulinerItem.nama
                kategori.text=kulinerItem.kategori
            }
            itemView.setOnClickListener{
                listener.onClick(kulinerItem)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapter.Homeholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
        return Homeholder(view)

    }

    override fun getItemCount(): Int {
        return listMakanan.size
    }

    override fun onBindViewHolder(holder: HomeAdapter.Homeholder, position: Int) {
        holder.bind(listMakanan[position],listener)
    }
}