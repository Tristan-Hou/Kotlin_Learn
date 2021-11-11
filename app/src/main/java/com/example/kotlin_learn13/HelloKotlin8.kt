package com.example.kotlin_learn13

import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.javaGetter

class T(val x: Int)

fun main() {
    println(T::x.javaGetter)
    println(T::x.javaField)
    println(T::x.javaClass)

    println("~~~~~~~~~~~")

    println(T(10).javaClass)
    println(T(10).javaClass.kotlin)

    println(String.javaClass)
    println(String.javaClass.kotlin)

}