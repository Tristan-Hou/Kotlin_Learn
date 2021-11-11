package com.example.kotlin_learn6

fun main() {
    var sum = " "

    val strings = arrayOf("hello", "world", "bye")

    strings.filter { it.length > 3 }.forEach {
        sum += it
    }

    println(sum)
}