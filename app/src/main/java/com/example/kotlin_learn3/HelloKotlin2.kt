package com.example.kotlin_learn3

// 内部类
/*
 嵌套类与内部类区别
 1. 嵌套类： 对应于java的静态内部类
 2. 内部类： 对应于java的非静态内部类
 */
class OuterClass2 {
    private val str: String = "hello world"
    inner class InnerClass {
        fun innerMethod() = this@OuterClass2.str
    }

    // 局部嵌套类
    fun getName() : String {
        class LocalNestedClass {
            val name: String = "name"
        }

        var localNestedClass = LocalNestedClass()
        return localNestedClass.name
    }
}

fun main() {
    println(OuterClass2().InnerClass().innerMethod())

    println(OuterClass2().getName())
}