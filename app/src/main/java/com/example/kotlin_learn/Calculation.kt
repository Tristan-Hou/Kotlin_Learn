package com.example.kotlin_learn2

fun multiply(a: Int, b: Int) = a * b

abstract class Base {
    val code = calculate()
    abstract fun calculate(): Int
}

class Derived(private val x: Int) : Base() {
    override fun calculate() = x
}

fun testIt() {
    Derived(42)
//    println(Derived(42).code) // Expected: 42, actual: 0
}

fun main() {
    testIt()
}