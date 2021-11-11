package com.example.kotlin_learn13

import kotlin.reflect.full.memberProperties

class MyTestClass6 {
    val name: String = "hello world"
}

fun main() {
    val myTestClass6 = MyTestClass6::class
    val testClass6 = MyTestClass6()

    val variableToInvoke = myTestClass6.memberProperties.find { it.name == "name" }
    println(variableToInvoke?.call(testClass6))
    println(variableToInvoke?.get(testClass6))
}