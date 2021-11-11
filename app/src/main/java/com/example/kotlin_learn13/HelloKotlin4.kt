package com.example.kotlin_learn13

/*
    函数组合
 */

fun <A, B, C> myCompose(f: (B) -> C, g: (A) -> B) : (A) -> C {
    return { x -> f(g(x))}
}

fun isEven(x: Int) = 0 == x % 2

fun length(str: String) = str.length

fun main() {
    val evenLength = myCompose(::isEven, ::length)
    val strings = listOf("a", "ab", "abc", "abcd", "abcde")

    println(strings.filter(evenLength))
}