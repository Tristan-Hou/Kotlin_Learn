package com.example.kotlin_learn13

import kotlin.reflect.full.memberProperties

class MyTestClass2(val s: String, val flag: Boolean, var age: Int) {

}

fun main() {
    val myTestClass2 = MyTestClass2::class
    println(myTestClass2.memberProperties)
}