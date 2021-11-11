package com.example.kotlin_learn12

class MyClass {
    val a: Int
        @JvmName("getAValue")
        get() { return 20 }

    fun getA() = 30
}

fun main() {
    val myClass = MyClass()
    println(myClass.getA())
    println(myClass.a)
}