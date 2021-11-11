package com.example.kotlin_learn8

import java.lang.Integer.parseInt
import java.lang.NumberFormatException

// 异常 ， kotlin中try是个表达式
// Kotlin 没有checked exception
fun main() {
    val s = "3"

    val result: Int? = try {
        parseInt(s)
    } catch (ex: NumberFormatException) {
        null
    } finally {
        println("do final")
    }
    println(result)
    println("~~~~~~~")
}