package com.example.kotlin_learn5

fun test(a: Int = 0, b: Int = 0) = println(a - b)

fun test3(a: Int = 1, b: Int = 2, compute: (x: Int, y : Int) -> Unit) {
    compute(a, b)
}

fun test4(vararg strings: String) {
    println(strings.javaClass)
    strings.forEach { println(it) }
}

fun main() {
//    Test()
    test(2)
    test(b = 1)
    test(2, 4)
    println("~~~~~~~")

    test3 ( 2, 3, ::test)
    test3(2, 3, {a, b ->  println(a - b)})
    test3(2, 3) { a, b -> println(a - b) }
    test3(2) { a, b -> println(a - b)}
    test3 {a, b -> println(a - b)}

    test4("a", "b", "c")
    // spread operator
    test4(strings = *arrayOf("a", "b", "c"))
    val arrays = arrayOf("a", "b", "c")
    test4(*arrays)
}

open class A {
    open fun methon(a: Int, b: Int = 4) = a + b
}

class B: A() {
    override fun methon(a: Int, b: Int): Int {
        return a + b
    }
}