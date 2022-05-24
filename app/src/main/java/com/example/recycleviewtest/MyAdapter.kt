package com.example.recycleviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

//    val pointer: ImageView = itemView.findViewById(R.id.actor_item_pointer_iv)
    val actorTitle: TextView = itemView.findViewById(R.id.actor_item_title_tv)

}

class MyAdapter constructor(
    val items: List<String>
) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.actorTitle.text = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }

}