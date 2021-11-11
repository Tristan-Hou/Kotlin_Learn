package com.example.kotlin_learn11

class Test {
    var name: String = "zhangsan"
}

fun say(msg: String) {
    println("Hello $msg")
}

/**
 * 当调用的函数有形参时，
 * 需要在调用的函数声明，并使用声明的形参；
 * 函数参数中的形参无法使用
 */
fun people(arg0: String, vararg hello: (arg1: String) -> Unit) {
//    hello(arg0)
    // hello(arg1) 这样调用将报错
    hello.forEach { it(arg0) }
}

fun main() {
//    people("Android") { say("World") }
    people("Android", ::say)
}

interface myInterface {
    fun getListProject(): String
}