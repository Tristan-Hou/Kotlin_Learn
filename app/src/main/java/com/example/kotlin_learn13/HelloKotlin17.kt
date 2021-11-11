package com.example.kotlin_learn13

import kotlin.reflect.full.functions

class MyTestClass5 {
    fun printSomething(str: String) {
        println("something: $str")
    }

    fun printNothing() {
        println("nothing")
    }
}

fun main() {
    val myTestClass5 = MyTestClass5::class
    val testClass5 = MyTestClass5()

    var functionToInvoke = myTestClass5.functions.find { it.name == "printNothing" }
    functionToInvoke?.call(testClass5)

    val functionToInvoke2 = MyTestClass5::class.functions.find { it.name == "printSomething" }
    functionToInvoke2?.call(testClass5, " k")
}