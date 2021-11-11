package com.example.kotlin_learn13

import kotlin.reflect.full.companionObject

class MyTestClass8 {

    companion object AAA {
        fun method() {
            println("hello")
        }
    }
}

fun main() {
    var myTestClass8 = MyTestClass8::class
    var companionObj8 = myTestClass8.companionObject
    println(companionObj8)

    MyTestClass8.method()
}