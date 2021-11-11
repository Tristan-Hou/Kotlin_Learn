package com.example.kotlin_learn6

fun main() {
    fun(x: Int, y: Int): Int = x + y
    fun (x: Int, y: Int) : Int {
        return x + y
    }

    val strings = arrayOf("hello", "world", "bye")
    strings.filter { it.length > 3 }.forEach{ println(it)}
    strings.filter(fun(item): Boolean = item.length > 3).forEach(fun(item) { println(item)})

}