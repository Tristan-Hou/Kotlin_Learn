package com.example.kotlin_learn5

import java.lang.StringBuilder

fun String.filter(predicate: (Char) -> Boolean) : String {
    val sb = StringBuilder()

    for (index in 0 until length) {
        val element = get(index)

        if (predicate(element)) {
            sb.append(element)
        }
    }
    return sb.toString()
}

fun main() {
    var str = "hell7wor19"

    println(str.filter { it > 'a' })
}