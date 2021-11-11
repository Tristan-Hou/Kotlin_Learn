package com.example.kotlin_learn3

// 嵌套类
class OuterClass {
    private val str: String = "hello world"

    class NestedClass {
        fun nestedMethod() = "welcome"
    }

    class NestedClass2 {
        val nestedMethod2 = NestedClass()
    }
}

fun main() {
    println(OuterClass.NestedClass().nestedMethod())
}