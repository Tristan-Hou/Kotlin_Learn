package com.example.kotlin_learn13

import java.io.Serializable
import kotlin.reflect.full.superclasses

class MySerializable : Serializable, MyInterface {

}

fun main() {
    val mySerializable = MySerializable::class
    println(mySerializable.superclasses)
}

interface MyInterface