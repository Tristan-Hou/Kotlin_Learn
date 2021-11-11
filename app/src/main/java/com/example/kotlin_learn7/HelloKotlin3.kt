package com.example.kotlin_learn7

fun main() {
    val items = listOf(1, 2, 3, 4)

    println(items.first())
    println(items.last())

    items.filter { it % 2 == 0 }.forEach{ println(it)}

    println("~~~~~~~~~")

    val myList = mutableListOf(1, 2, 3)
    println(myList.requireNoNulls())
    println("~~~~~~")

    if (myList.none { it > 10 }) {
        println("no > 10")
    }
    println(myList.firstOrNull())
    println(myList.lastOrNull())

    val myMap = hashMapOf("hello" to 1, "world" to 2)
    println(myMap["hello"])

    val mymao2: Map<String, Int> = HashMap(myMap)
    println(mymao2)
}