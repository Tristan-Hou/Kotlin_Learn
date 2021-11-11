package com.example.kotlin_learn

import java.lang.NumberFormatException

fun main(args: Array<String>) {
    println(convert2Int("ab"))

    printMultiply("2", "a")
}

fun convert2Int(str: String): Int? {
    return try {
        str.toInt()
    } catch (ex: NumberFormatException) {
        null
    }
}

fun printMultiply(a: String, b: String) {
    val a2Int = convert2Int(a)
    val b2Int = convert2Int(b)

    if (null != a2Int && null != b2Int) {
        println(a2Int * b2Int)
    } else {
        println("param not int")
    }
}