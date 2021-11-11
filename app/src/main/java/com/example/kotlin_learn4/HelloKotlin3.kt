package com.example.kotlin_learn4

// 延迟属性

val myLazyValue : Int by lazy(LazyThreadSafetyMode.NONE) {
    println("hello world")
    7
}

fun main() {
    println(myLazyValue)
    println(myLazyValue)
}