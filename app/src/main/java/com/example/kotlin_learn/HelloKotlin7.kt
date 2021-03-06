package com.example.kotlin_learn

fun main(args: Array<String>) {
    println(myPrint("hello"))
    println(myPrint2("world"))

    println("~~~~~~~")

    var a = 6
    var result = when(a) {
        1 -> {
            println("a = 1")
            10
        }
        2 -> {
            println("a = 2")
            20
        }
        3, 4, 5 -> {
            println("a = 3/4/5")
            30
        }
        in 6..10 -> {
            println("a is between 6 and 10")
            40
        }
        else -> {
            println("a is other")
            50
        }
    }
    println(result)
}

fun myPrint(str : String) : String {
    return when(str) {
        "hello" -> "HELLO"
        "world" -> "WORLD"
        "hello world" -> "HELLO WORLD"
        else -> "other input"
    }
}

fun myPrint2(str: String) : String =
    when(str) {
        "hello" -> "HELLO"
        "world" -> "WORLD"
        "hello world" -> "HELLO WORLD"
        else -> "other input"
    }