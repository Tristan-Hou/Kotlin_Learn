package com.example.kotlin_learn13

import kotlin.reflect.full.createInstance
import kotlin.reflect.full.declaredFunctions
import kotlin.reflect.full.functions

class MyTestCLASS11 {

    fun method(message: String) {
        println("method0 : $message")
    }

    fun methodback(message: String) {
        println("methodaaaaa : $message")
    }

    fun method(message: String, price: Double): Unit {
        println("method1: $message $price")
    }
}

fun main() {
    val clazz = MyTestCLASS11::class
    val instance = clazz.createInstance()

    val funs = clazz.declaredFunctions

    for (f in funs) {
        if (f.parameters.size == 3) {
            f.call(instance, "ruby", 3.4)
        }
        if (f.parameters.size == 2) {
            f.call(instance, "java")
        }
    }
    var functionToInvoke = clazz.functions.find { it.name == "methodback" }
    functionToInvoke?.call(instance, "k;p")
}