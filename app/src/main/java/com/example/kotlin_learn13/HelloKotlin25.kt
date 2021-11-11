package com.example.kotlin_learn13

import kotlin.reflect.full.createInstance

class MyTestClass13 {
    var name = "spark"
    var price = 3.4
}

var test = "test"

fun main() {
//    val topProp = ::test
//    println(test)
//    topProp.set("change")
//
//    println(test)
//    println(topProp.get())

    val clazz = MyTestClass13::class
    val instance = clazz.createInstance()
    var name = MyTestClass13::name
    println(name)
    println(name.get(instance))
    name.set(instance, "ruby")
    println(name.get(instance))

    val prop = MyTestClass13::price
    println(prop.get(instance))
}