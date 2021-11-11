package com.example.kotlin_learn13

/*
    函数（方法）引用

    支持重载

    ::multiplyBy3表示函数类型 (Int) -> Int 的值
 */
fun multiplyBy3(x: Int): Int {
    return 3 * x
}

fun multiplyBy3(s: String): Int {
    return 10
}

fun main() {
    val values = listOf(1, 2, 3, 4)
    println(values.map(::multiplyBy3))
    println(values.map { multiplyBy3(it) })

    println("~~~~~~~~")

    val values2 = listOf("a", "b", "c", "d")
    println(values2.map(::multiplyBy3))
    println(values2.map { multiplyBy3(it) })

    test(::multiplyBy3, ::multiplyBy3)
}

fun test(vararg element: (Int) -> Int) {

}

val myReference : (Int) -> Int = ::multiplyBy3
val myReference2 : (String) -> Int = ::multiplyBy3
val myReference3 : Int = multiplyBy3(2)
val myReference4 : Int = multiplyBy3("ss")

val myReference5 : (String, Int) -> Char = String::get

