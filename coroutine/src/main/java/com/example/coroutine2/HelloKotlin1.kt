package com.example.coroutine2

import kotlinx.coroutines.*
import java.util.concurrent.CancellationException

fun main() = runBlocking {
    val myJob = GlobalScope.launch {
        repeat(100) {i ->
            println("hello $i")
            delay(500)
        }
    }

    delay(1100)
    println("hello world")

//    myJob.cancel(CancellationException("just a try"))
//    myJob.join()

    myJob.cancelAndJoin()

    println("welcome")
}