package com.example.coroutine

import kotlinx.coroutines.*

fun main() = runBlocking {
    val myJob : Job = GlobalScope.launch {
        delay(1000)
        println("Kotilin coroutines")
    }

    println("Hello")

    myJob.join()

    println("world")
}