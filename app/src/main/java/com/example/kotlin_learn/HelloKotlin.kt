package com.example.kotlin_learn

fun main(args: Array<String>) {
    println(sum(1, 2))
    println(sum2(3, 4))
val a :Int = 3
    myPrint(2, 3)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun myPrint(a: Int, b: Int) : Unit {
    println("$a + $b = ${a + b}")
}

