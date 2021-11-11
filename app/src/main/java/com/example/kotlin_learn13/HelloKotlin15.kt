package com.example.kotlin_learn13

import kotlin.reflect.full.memberFunctions

class MyTestClass3 {
    fun printSomething() {
        println("something")
    }

    fun printNothing() {
        println("")
    }
}

fun main() {
    val myTest3 = MyTestClass3::class
    println(myTest3.memberFunctions)
}