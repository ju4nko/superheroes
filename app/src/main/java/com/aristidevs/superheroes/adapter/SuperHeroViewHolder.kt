package com.aristidevs.superheroes.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.aristidevs.superheroes.Superhero
import com.aristidevs.superheroes.databinding.ItemSuperheroBinding
import com.bumptech.glide.Glide

class SuperHeroViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)


    fun render(
        superhero: Superhero,
        onClickListener: (Superhero) -> Unit,
        onCLickDelete: (Int) -> Unit
    ) {
        binding.tvRealname.text = superhero.realName
        binding.tvPublisher.text = superhero.publisher
        binding.tvSuperheroName.text = superhero.superHeroName
        Glide.with(binding.ivSuperheroe.context).load(superhero.image).into(binding.ivSuperheroe)
        binding.ivSuperheroe.setOnClickListener {
            Toast.makeText(binding.ivSuperheroe.context, superhero.realName, Toast.LENGTH_SHORT)
                .show()
        }
        binding.btnDelete.setOnClickListener{onCLickDelete(adapterPosition)}
    }
}