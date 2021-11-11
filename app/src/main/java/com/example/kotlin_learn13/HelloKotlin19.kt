package com.example.kotlin_learn13

import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.memberProperties

class MyTestClass7 {
    var name: String = "hello world"
    var authorname :String = "tom"
}

fun main() {
    val myTestClass7 = MyTestClass7::class
    var testClass7 = MyTestClass7()

    var va = myTestClass7.memberProperties.find { it.name == "name" }
    println(va?.get(testClass7))

    if (va is KMutableProperty<*>) {
        va.setter.call(testClass7, "kite")
    }
    println(va?.get(testClass7))
}