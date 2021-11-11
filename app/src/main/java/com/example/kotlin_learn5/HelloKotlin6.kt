package com.example.kotlin_learn5

import com.example.kotlin_learn2.calculate

fun myCalculate(a: Int, b: Int, calculate: (Int, Int) -> Int): Int {
    return calculate(a, b)
}

fun main() {
    println(myCalculate(2, 3) { x, y -> x + y})
    println(myCalculate(2, 3) { x, y -> x * y})
}
