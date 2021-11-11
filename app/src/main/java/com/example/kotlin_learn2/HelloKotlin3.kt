package com.example.kotlin_learn2

// 泛型

class MyGeneric<T>(t: T) {
    var variable: T
    init {
        this.variable = t
    }
}

fun main() {
//    var myGeneric : MyGeneric<String> = MyGeneric<String>("hello world")
    val myGeneric = MyGeneric("hello")
    println(myGeneric.variable)
    println("~~~~~~")

    var myClass = MyClass<String, Number>("abc", 2)
    myTest(myClass)
}

// 协变与逆变
class MyClass<out T, in M>(t: T, m: M) {
    private var t: T
    private var m: M
    init {
        this.t = t
        this.m = m
    }
    fun get(): T = this.t
    fun set(m: M) {
        this.m = m
    }
}

fun myTest(myClass: MyClass<String, Number>) {
    var myObject : MyClass<Any, Int> = myClass
    println(myObject.get())
}