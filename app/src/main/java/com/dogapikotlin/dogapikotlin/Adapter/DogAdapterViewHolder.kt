package com.dogapikotlin.dogapikotlin.Adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.dogapikotlin.dogapikotlin.databinding.ItemDogsBinding
import com.squareup.picasso.Picasso

class DogAdapterViewHolder (view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemDogsBinding.bind(view)

    fun bind(image: String){
        Picasso.get().load(image).into(binding.imgDog)
    }

}