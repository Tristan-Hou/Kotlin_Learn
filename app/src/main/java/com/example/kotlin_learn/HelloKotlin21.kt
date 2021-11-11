package com.example.kotlin_learn

class TheClass {
    lateinit var name: String
    val a by lazy{ ""}

    fun init() {
        this.name = "zhangsan"
    }

    fun print() {
        println(this.name)
    }
}

fun main() {
    var theClass = TheClass()
    theClass.init()
    theClass.print()
}