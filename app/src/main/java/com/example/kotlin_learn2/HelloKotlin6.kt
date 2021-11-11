package com.example.kotlin_learn2

// use-site variance(type projection)， 类型投影
fun copy(from: Array<out Any>, to: Array<Any>) {
    assert(from.size == to.size)
    for (i in from.indices) {
        to[i] = from[i]
    }

}

fun main() {
    val from: Array<Int> = arrayOf(1,2,3,4)
    val to: Array<Any> = Array<Any>(4) { "hello" + it}

    for (item in to) {
        println(item)
    }

    copy(from, to)

    println("~~~~~~~~~~~")

    val array: Array<Any> = arrayOf("1", "2", "3", "4")
    for (item in array) {
        println(item)
    }
    println("~~~~~~~~~~~")
    setValue(array, 1, "world")
    for (item in array) {
        println(item)
    }
}

fun setValue(to: Array<in String>, index: Int, value: String) {
    to[index] = value
}