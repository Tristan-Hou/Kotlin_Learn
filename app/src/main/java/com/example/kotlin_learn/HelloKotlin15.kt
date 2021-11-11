package com.example.kotlin_learn

open class Fruit {
    open fun name() {
        println("fruit")
    }

    fun expirationData() {
        println("1 month")
    }
}

class Apple : Fruit() {
    override fun name() {
        println("apple")
    }

    public var mm = 1
}

open class Orange: Fruit() {
    final override fun name() {
        println("orange")
    }
}

class ChengZi: Orange() {
//    override fun name() {
//
//    }
}

fun main(args: Array<String>) {
    val apple = Apple()
    apple.name()
    apple.expirationData()
}