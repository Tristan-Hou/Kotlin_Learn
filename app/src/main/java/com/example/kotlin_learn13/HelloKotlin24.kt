package com.example.kotlin_learn13

import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.declaredMemberProperties

class MyTestClass12 {
    var name : String = "slsl"
    var price : Double = 3.3
}

fun main() {
    var clazz = MyTestClass12::class
    var instance = clazz.createInstance()
    var props = clazz.declaredMemberProperties

    props.forEach{
        when(it.name) {
            "name" -> {
                val kmp = it as KMutableProperty1<MyTestClass12, Any>
                kmp.set(instance, "java")
                println(it.get(instance))
            }
            "price" -> {
                println(it.get(instance))
            }
        }
    }
}