package com.example.kotlin_learn2

import com.example.kotlin_learn.Apple

class MyStorage<out T>(private var t: T) {
    fun getValue(): T {
        return t
    }

    fun setValue(t: @UnsafeVariance T) {
        this.t = t
    }
}

fun main() {
    var myStorage1: MyStorage<Int> = MyStorage(5)
    val myStorage2: MyStorage<Any> = myStorage1

    println(myStorage2.getValue())

    myStorage2.setValue("hello")
    println(myStorage2.getValue())

    val a = Apple()
    a.mm = 1
}