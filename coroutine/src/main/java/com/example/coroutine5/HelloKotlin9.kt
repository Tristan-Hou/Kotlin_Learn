package com.example.coroutine5

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

/*
    transform


 */
private suspend fun myExecution(input : Int) : String {
    delay(1000)
    return "output: $input"
}

fun main() = runBlocking {
    (1..10).asFlow().transform {
        emit("my input: $it")
        emit((myExecution(it)))
        emit("hello world")
    }.collect { println(it) }
}



