package com.example.kotlin_learn13

class MyTestClass4(val value: Int) {

    constructor(amount: Int, color: String): this(amount) {
        println("secondary")
    }

    constructor(amount: Int, full: Boolean): this(amount) {
        println("second")
    }

    fun printSomething() {
        println("something")
    }
}

fun main() {
    val myTestClass4 = MyTestClass4::class
    val  cons = myTestClass4.constructors
    println(myTestClass4.constructors)
}