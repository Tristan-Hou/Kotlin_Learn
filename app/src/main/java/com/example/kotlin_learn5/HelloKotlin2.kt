package com.example.kotlin_learn5

fun myPrint(name: String) : Unit {
    println(name)
    return Unit
}

fun add(a: Int, b: Int) = a + b

fun add1(a: Int, b: Int) {
    a + b
}

fun <T> convert2List(vararg element: T) : List<T> {
    val result = ArrayList<T>()

    element.forEach { result.add(it) }
    return result
}

fun main() {
    println(convert2List("a", "b", "c"))

    val elements = arrayOf("1", "2", "3")
    println(convert2List("beijing", "shanghai", *elements))
}
