package com.example.kotlin_learn5

// 内联函数

inline fun myCalculate(a: Int, b: Int) = a + b

fun main() {
    println(myCalculate(3, 4))
}