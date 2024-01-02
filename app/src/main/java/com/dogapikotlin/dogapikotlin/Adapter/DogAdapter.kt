package com.dogapikotlin.dogapikotlin.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dogapikotlin.dogapikotlin.R

class DogAdapter(val images: List<String>):RecyclerView.Adapter<DogAdapterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogAdapterViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        return DogAdapterViewHolder(layoutInflater.inflate(R.layout.item_dogs, parent, false))
    }

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: DogAdapterViewHolder, position: Int) {
        val item: String = images[position]
        holder.bind(item)
    }

}