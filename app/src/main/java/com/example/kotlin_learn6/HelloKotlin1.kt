package com.example.kotlin_learn6

fun main() {
    val strings = arrayOf("hello", "world", "bye")

    strings.filter {
        val mayFilter = it.length > 3
        mayFilter
    }

    strings.filter {
        return@filter it.length > 3
    }
}