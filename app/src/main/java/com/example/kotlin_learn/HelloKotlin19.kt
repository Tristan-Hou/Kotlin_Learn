package com.example.kotlin_learn

object MyObject {
    fun method() {
        println("method")
    }
}

fun main(args: Array<String>) {
    MyObject.method()

    println("~~~~")

    MyTest.method()

    val v = MyTest.MyObject
    println(v.javaClass)
    println("~~~~~~")

    MyTest.method()
    MyTest.staticMethod()
    MyTest.MyObject.method()
    MyTest.MyObject.staticMethod()

}

class MyTest {

    companion object MyObject{
        @JvmStatic var a: Int = 100

        fun method() {
            println("method invoked")
        }

        @JvmStatic
        fun staticMethod() {

        }
    }
}