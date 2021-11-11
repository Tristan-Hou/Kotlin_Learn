package com.example.kotlin_learn13

/*
    构造方法引用

    1. 函数对象的参数要与构造方法的参数保持一致（个数和类型）
    2. 函数对象的返回结果要与构造方法所在类的类型一致
 */

class B(val x: Int)

fun myMethod(factory: (x: Int) -> B) : Unit {
    val b: B = factory(3)
    println(b.x)
}

fun main() {
    myMethod(::B)
}