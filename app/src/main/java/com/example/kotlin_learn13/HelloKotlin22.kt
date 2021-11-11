package com.example.kotlin_learn13

import kotlin.reflect.full.createInstance

class MyTestClass10(var nam: String) {
    var price = 0.0

    constructor() : this("weizhi") {
        this.price = 0.0
    }

    constructor(name : String, a: Double) :this(name){
        this.price = a
    }
}

fun main() {
    val clazz = MyTestClass10::class
    val instance  = clazz.createInstance()

    println(instance.nam)
    println(instance.price)

    val  cons = clazz.constructors
    cons.forEach {
        if (it.parameters.size == 2) {
            val instance2 = it.call("ppp", 34.5)
            println(instance2.nam)
            println(instance2.price)

            for (i in it.parameters) {
                println(i.type)
            }
        }
    }
}



