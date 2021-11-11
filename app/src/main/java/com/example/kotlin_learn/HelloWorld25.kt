package com.example.kotlin_learn

class CompanionObjectExtension {
    companion object MyObject {

    }
}

fun CompanionObjectExtension.MyObject.method() {
    println("hello world")
}

fun main() {
    CompanionObjectExtension.MyObject.method()
}