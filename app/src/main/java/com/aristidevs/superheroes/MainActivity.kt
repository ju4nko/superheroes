package com.aristidevs.superheroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aristidevs.superheroes.adapter.SuperheroAdapter
import com.aristidevs.superheroes.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

private lateinit var adapter: SuperheroAdapter

private var superheroMutableList: MutableList<Superhero> =
    SuperheroProvider.superheroList.toMutableList()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.addSuperhero.setOnClickListener {createSuperHero()}
        initRecyclerView()
    }

    private fun createSuperHero() {
        val superhero = Superhero(
            "Incógnito",
            "????????",
            "AristidevsCorporation",
            "https://pbs.twimg.com/profile_images/1037281659727634432/5x2XVPwB_400x400.jpg"
        )
        superheroMutableList.add(index = 3, superhero)
        adapter.notifyItemInserted(3)
    }

    private fun initRecyclerView() {
        adapter = SuperheroAdapter(
            superhero = superheroMutableList,
            onClickListener = { superhero -> onItemSelected(superhero) },
            onCLickDelete = { onDeteleItem(it) })
        val manager = LinearLayoutManager(this)
        binding.rvSuperHero.layoutManager = LinearLayoutManager(this)
        binding.rvSuperHero.adapter = adapter
    }

    fun onDeteleItem(position: Int) {
        superheroMutableList.removeAt(position)
        adapter.notifyItemRemoved(position)
    }

    fun onItemSelected(superhero: Superhero) {
        Toast.makeText(this, superhero.realName, Toast.LENGTH_SHORT).show()
    }
}