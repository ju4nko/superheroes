package com.aristidevs.superheroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

val superheros = listOf(
    Superhero("Spiderman", "Peter Parker", "Marvel", "https://loquesea.com"),
    Superhero(
        "Spiderman",
        "Peter Parker", "Marvel", "https://loquesea.com"
    ),
    Superhero(
        "Spiderman",
        "Peter Parker", "Marvel", "https://loquesea.com"
    ),
    Superhero(
        "Spiderman",
        "Peter Parker", "Marvel", "https://loquesea.com"
    ),
    Superhero(
        "Spiderman",
        "Peter Parker", "Marvel", "https://loquesea.com"
    ),
    Superhero(
        "Spiderman",
        "Peter Parker", "Marvel", "https://loquesea.com"
    )
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}