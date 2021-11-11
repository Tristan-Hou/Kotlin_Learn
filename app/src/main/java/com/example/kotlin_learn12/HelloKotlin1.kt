package com.example.kotlin_learn12

fun List<String>.myFilter() : List<String> {
    return listOf("hello", "world")
}

@JvmName("myFilter2")
fun List<Int>.myFilter() : List<Int> {
    return listOf(1, 2, 3)
}

fun main() {
    val list = listOf<String>()
    list.myFilter()

    val list2 = listOf<Int>()
    list2.myFilter()
}
