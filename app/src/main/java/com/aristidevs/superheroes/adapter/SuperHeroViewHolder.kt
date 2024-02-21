package com.aristidevs.superheroes.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aristidevs.superheroes.R
import com.aristidevs.superheroes.Superhero

class SuperHeroViewHolder(val view: View): RecyclerView.ViewHolder(view) {

    val superheroName = view.findViewById<TextView>(R.id.tvSuperheroName)
    val realName = view.findViewById<TextView>(R.id.tvRealname)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    val image = view.findViewById<ImageView>(R.id.ivSuperheroe)

    fun render(superhero: Superhero) {
        superheroName.text = superhero.superHeroName
        realName.text = superhero.realName
        publisher.text = superhero.publisher
    }
}