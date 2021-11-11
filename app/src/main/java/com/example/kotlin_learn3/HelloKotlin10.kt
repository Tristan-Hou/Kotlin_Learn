package com.example.kotlin_learn3

enum class Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

enum class Season2(val temperature: Int) {
    SPRING(10), SUMMER(20), AUTUMN(30), WINTER(40)
}

enum class Season3 {
    SPRING {
        override fun getSeason(): Season3 {
            return SPRING
        }
    },
    SUMMER {
        override fun getSeason(): Season3 = SUMMER
    },
    AUTUMN {
        override fun getSeason(): Season3 = AUTUMN
    },
    WINTER {
        override fun getSeason() : Season3 = WINTER
    };
    abstract fun getSeason() : Season3
}

fun main() {
    val seasons = Season3.values()
    seasons.forEach { season: Season3 -> println(season) }
    seasons.forEach { println(it) }
    println("~~~~~~~~")

    val season = Season.valueOf("SPRING")
    println(season.name)
}