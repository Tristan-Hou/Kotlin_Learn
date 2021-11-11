package com.example.kotlin_learn5

// 中缀符号 infix notation
class InfixTest(private var a: Int) {
    infix fun add(b: Int) = this.a + b
}

fun main() {
    val infixTest = InfixTest(2)

    println(infixTest.add(5))
    println(infixTest add 5)
}