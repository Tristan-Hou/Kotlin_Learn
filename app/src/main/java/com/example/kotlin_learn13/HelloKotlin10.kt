package com.example.kotlin_learn13

/*
    我们可引用特定对象的一个实例方法
 */

fun main() {
    val str = "abc"
    val getReference = str::get
    println(getReference(1))
    println(str[1])

    println("~~~~~~~~")
    val myProp = "test"::length
    println(myProp.get())

    println("~~~~~~~")
    println(String::length.get("test"))
}