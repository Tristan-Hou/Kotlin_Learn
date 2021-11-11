package com.example.kotlin_learn13

import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.javaGetter
import kotlin.reflect.jvm.javaSetter

class MyTestClass14 {
    var name = "java"
    var price = 2.3
}

var myTest = "mytest"

fun main() {
    var topProp = ::myTest
    println(topProp.javaField)

    println(topProp.javaGetter)
    println(topProp.javaSetter)

    val n = MyTestClass14::name
    println(n.javaField)
    println(n.javaGetter)
    println(n.javaSetter)
}