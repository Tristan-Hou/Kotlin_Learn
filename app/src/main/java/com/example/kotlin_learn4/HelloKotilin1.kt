package com.example.kotlin_learn4

// 委托

interface MyInterface {
    fun myPrint()
}

class MyInterfaceImpl(val str: String): MyInterface {
    override fun myPrint() {
        println("welcome: " + str)
    }
}

class MyClass(myInterface: MyInterface) : MyInterface by myInterface {
//    override fun myPrint() {
//        println("hello world")
//    }
}

fun main() {
    val myInterfaceImpl = MyInterfaceImpl("shanghai")
    MyClass(myInterfaceImpl).myPrint()
}