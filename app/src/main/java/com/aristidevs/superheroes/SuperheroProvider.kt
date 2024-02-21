package com.aristidevs.superheroes

class SuperheroProvider {

    companion object {
        val superheroList = listOf(
            Superhero(
                "Spiderman", "Peter Parker", "Marvel",
                "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman"
            ),
            Superhero(
                "Daredevil",
                "Peter Parker",
                "Marvel",
                "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil"
            ),
            Superhero(
                "Lobezno",
                "James Howlet", "Marvel", "https://cursokotlin.com/wp-content/uploads/2017/07/logan"
            ),
            Superhero(
                "Batman",
                "Bruce Wayne", "DC", "https://cursokotlin.com/wp-content/uploads/2017/07/batman"
            ),
            Superhero(
                "Thor",
                "Thor Odinson", "Marvel", "https://cursokotlin.com/wp-content/uploads/2017/07/thor"
            ),
            Superhero(
                "IronMan",
                "TonyStark", "Marvel", "https://cursokotlin.com/wp-content/uploads/2017/07/thor"
            )
        )
    }
}