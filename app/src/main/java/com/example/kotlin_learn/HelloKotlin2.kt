package com.example.kotlin_learn

//import com.example.kotlin_learn2.multiply
import com.example.kotlin_learn2.multiply as myMultiply

fun main(args: Array<String>) {
    val a: Int = 1
    val b = 2

    var c: Int
    c = 3

    var d = 3
    d = 4

    println("$d = d")

    var x = 10
    var y : Byte = 20

    x = y.toInt()

    println(myMultiply(2, 4))

    val m = intArrayOf(1, 2, 3)
//    m = intArrayOf(4)
    m.set(0, 4)
    m[1] = 5
    for (item in m) {
        println(item)
    }
}