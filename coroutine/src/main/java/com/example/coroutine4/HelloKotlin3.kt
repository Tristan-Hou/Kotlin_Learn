package com.example.coroutine4

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

/*
    vm options: -Dkotlinx.coroutines.debug
 */

private fun log(logMessage: String) = println("[${Thread.currentThread().name}] $logMessage")

fun main() = runBlocking {
    val a = async {
        log("hello world")
        10
    }

    val b = async {
        log("welcome")
        20
    }

    log("THe result is ${a.await() * b.await()}")
}