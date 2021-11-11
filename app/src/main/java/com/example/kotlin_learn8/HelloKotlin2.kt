package com.example.kotlin_learn8

import kotlin.IllegalArgumentException

// throw 在kotlin中是一个表达式，因此我们可以将throw作为Elvis表达式的一部分
// throw 表达式的类型是一种特殊类型：Nothing.
// 在自己代码中可以使用nothing标记永远不会返回的函数

fun main() {
    val str: String? = "a"
    val str2 = str ?: throw IllegalArgumentException("no value")
    println(str)
    println(str2)
    println("~~~~~~~")

    val str3: String? = null
//    val str4 = str3 ?: myMethod("hello")
//    println(str4)

    val ss = null
    println(ss is Nothing?)

    var ss2 = listOf(null)
    println(ss2 is List<Nothing?>)
}

fun myMethod(message: String) : Nothing {
    throw IllegalArgumentException()
}