package com.aristidevs.superheroes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aristidevs.superheroes.R
import com.aristidevs.superheroes.Superhero

// Aprendemos la clase heroAdapter para hacerlo de memoria
// Le pasamos un parámetro superhero que sea una lista de superheroes
// Devuelve un RecyclerView adapter de tipo HeroHolder

class SuperheroAdapter(private val superhero: List<Superhero>):RecyclerView.Adapter<SuperHeroViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun getItemCount(): Int = superhero.size

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        holder.render(superhero[position])
    }

}