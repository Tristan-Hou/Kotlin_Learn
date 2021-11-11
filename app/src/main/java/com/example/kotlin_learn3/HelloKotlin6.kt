package com.example.kotlin_learn3

// 对象表达式
// java当中匿名内部类
// kotlin中对象表达式为了解决匿名内部类的缺陷而产生

interface MyInterface {
    fun myPrint(i: Int)
}

abstract class MyAbstractClass {
    abstract val age: Int
    abstract fun printMyAbstractClassInfo()
}

fun main() {
    var myObject = object : MyInterface {
        override fun myPrint(i: Int) {
            println("i的值是： $i")
        }
    }

    myObject.myPrint(100)

    var myObject2 = object {
        init {
            println("初始化执行")
        }

        var myProperty = "hello world"
        fun myMethod() = "myMethod()"
    }

    println(myObject2.myProperty)
    println(myObject2.myMethod())

    var myObject3 = object : MyInterface, MyAbstractClass() {
        override fun myPrint(i: Int) {
            println("i")
        }

        override fun printMyAbstractClassInfo() {
            println("print")
        }

        override val age: Int
            get() = 30
    }

    myObject3.myPrint(200)
    println(myObject3.age)
    myObject3.printMyAbstractClassInfo()
}