package com.example.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        delay(1000)
        println("kotlin coroutine")
    }

    println("hello")

    Thread.sleep(2000)
    println("world")
}