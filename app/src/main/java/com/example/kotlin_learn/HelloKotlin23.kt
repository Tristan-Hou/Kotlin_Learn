package com.example.kotlin_learn

import javax.xml.transform.Source

class ExtensionTest {
    fun add(a: Int, b: Int) = a + b
    fun subtract(a: Int, b: Int) = a - b
}

fun ExtensionTest.multiply(a: Int, b: Int) = a * b

fun main() {
    val extensionTest = ExtensionTest()

    println(extensionTest.add(1, 2))
    println(extensionTest.subtract(1, 2))
    println(extensionTest.multiply(1, 2))
    println("~~~~~~~~~~~")

    myPrint(AA())
    myPrint(BB())

    CC().foo()
}

open class AA {

}

class BB: AA() {

}

fun AA.a() = "A"
fun BB.a() = "b"

fun myPrint(aa: AA) {
    println(aa.a())
}

class CC {
    fun foo() {
        println("member")
    }
}

fun CC.foo() {
    println("member2")
}

fun Any?.toString(): String {
    if (null == this) {
        return "null"
    }
    return toString()
}