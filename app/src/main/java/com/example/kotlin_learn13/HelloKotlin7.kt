package com.example.kotlin_learn13

/*
    扩展属性
 */
val String.firstChar: Char
    get() = this[0]

fun main() {
    val a = "xyg"
    println(a.firstChar)
    println(String::firstChar.get(a))
}

