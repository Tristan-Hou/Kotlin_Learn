package com.example.kotlin_learn12

class MyClass2 @JvmOverloads constructor(x: Int = 5, y: String = "hello"){
    fun myMethod(a: Int, b: String, c: Int = 5) {
        println("a: $a, b: $b, c: $c")
    }
}