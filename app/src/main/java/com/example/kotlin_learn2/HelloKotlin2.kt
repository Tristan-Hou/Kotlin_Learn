package com.example.kotlin_learn2

sealed class Calculator

class add: Calculator()

class subtract: Calculator()

//class multiply : Calculator()

fun calculate(a: Int, b: Int, cal: Calculator) = when (cal) {
    is add -> a + b
    is subtract -> a - b
//    else -> a + b
}

fun main() {
    println(calculate(1, 2, add()))
}