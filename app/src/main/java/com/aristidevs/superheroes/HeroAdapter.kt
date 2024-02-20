package com.aristidevs.superheroes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Aprendemos la clase heroAdapter para hacerlo de memoria
// Le pasamos un parámetro superhero que sea una lista de superheroes
// Devuelve un RecyclerView adapter de tipo HeroHolder

class HeroAdapter(val superhero: List<Superhero>):RecyclerView.Adapter<HeroAdapter.HeroHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superhero,parent, false))
    }

    override fun getItemCount(): Int = superhero.size

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superhero[position])
    }
    // La clase heroHolder recibe una vista y devuelve un RecyclerView.ViewHolder
    class HeroHolder(val view: View):RecyclerView.ViewHolder(view) {
        fun render(superhero: Superhero) {

            view.findViewById<TextView>(R.id.tvRealname).text = superhero.realName
            view.findViewById<TextView>(R.id.tvSuperheroName).text = superhero.superHeroName
            view.findViewById<TextView>(R.id.tvPublisher).text = superhero.publisher

        }

    }
}