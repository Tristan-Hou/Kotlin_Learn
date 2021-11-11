package com.example.kotlin_learn10

fun main() {
//    val myException = MyException()
//    myException.myMethod()
    println("~~~~~~~~~~~~")

    val clazz = MyException()::class.java
    val clazz1 = MyException().javaClass
    println(clazz)
    println(clazz1)
}