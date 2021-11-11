package com.example.kotlin_learn10

fun main() {
    val myVariance = MyVariant()
    val stringArray = arrayOf("hello", "world")

    myVariance.myMethod(*stringArray)            // spread operator
}