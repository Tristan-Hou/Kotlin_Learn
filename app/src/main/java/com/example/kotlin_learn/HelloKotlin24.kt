package com.example.kotlin_learn

fun main() {
    val myExtensionProperty = MyExtensionProperty()
    println(myExtensionProperty.name)
}

class MyExtensionProperty {

}

val MyExtensionProperty.name : String get() = "hello"

