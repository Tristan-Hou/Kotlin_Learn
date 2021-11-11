package com.example.coroutine5

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

/*
    flow flatten

    Flow<Flow<Int>> -> Flow<Int>

 */
private fun myMethod(i : Int): Flow<String> = flow {
    emit("$i: First")
    delay(500)
    emit("$i: Second")
}

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()

    (1..3).asFlow().onEach { delay(100) }
        .map { myMethod(it) }
        .collect { value ->
            println("$value at ${System.currentTimeMillis() - startTime} ms")
        }
}



