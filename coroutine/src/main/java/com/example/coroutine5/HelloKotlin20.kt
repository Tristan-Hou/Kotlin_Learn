package com.example.coroutine5

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

/*
    flow exception

 */

private fun myMethod() : Flow<Int> = flow {
    for (i in 1..3) {
        println("Emitting $i")
        emit(i)
    }
}

fun main() = runBlocking {
    try {
        myMethod().collect { value ->
            println(value)
            check(value <= 1) {
                "Collected $value"
            }
        }
    } catch (e: Throwable) {
        println("caught: $e")
    }
}