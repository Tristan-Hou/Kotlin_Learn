package com.example.kotlin_learn5

import java.util.*

fun main() {
    val strings = arrayOf("hello", "world", "helloworlD", "welcome")

    strings.filter { it.contains('h') }.forEach{println(it)}
    println("~~~~~~")

    strings.filter { it.length > 6 }.forEach { println(it) }
    println("~~~~~")

    strings.filter { it.endsWith("d", ignoreCase = true) }.map { it.toLowerCase(Locale.getDefault()) }.forEach { println(it) }
}