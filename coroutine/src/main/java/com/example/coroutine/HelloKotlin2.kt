package com.example.coroutine

import kotlin.concurrent.thread

fun main() {
    thread {
        Thread.sleep(1000)
        println("kotlin coroutine")
    }

    println("hello")

    Thread.sleep(2000)

    println("world")
}