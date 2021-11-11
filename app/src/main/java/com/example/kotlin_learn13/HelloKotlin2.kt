package com.example.kotlin_learn13

fun main() {
    val son: Parent = son()
    val daughter: Parent = daughter()

    println(son::class)
    println(son::class.java)

    println("~~~~~~~~")

    println(daughter::class)
    println(daughter::class.java)
}

open class Parent

class son : Parent() {

}

class daughter: Parent()