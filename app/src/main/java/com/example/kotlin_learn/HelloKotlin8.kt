package com.example.kotlin_learn

fun main(args: Array<String>) {
    val  a= 5
    val b = 10
    if (a in 2..b) {
        println("in the range $a")
    }
    println("~~~~~")

    if (b !in 2..a) {
        println("out the range $b")
    }
    println("~~~~~")

    for (i in 2..10) {
        println(i)
    }
    println("~~~~~")

    for (i in 2.rangeTo(10) ) {
        println(i)
    }
    println("~~~~~")

    for (i in 2..10 step 5) {
        println(i)
    }
    println("~~~~~")

    for (i in 10 downTo 2 step 4) {
        println(i)
    }
    println("~~~~~")

}