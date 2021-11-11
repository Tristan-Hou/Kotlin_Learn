package com.example.coroutine5

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

/*
    Flow Context

    Flow的收集动作总是发生在调用协程的上下文当中，这个特性叫做上下文保留（Context Preservation）

 */

private fun log(msg: String) = println("${Thread.currentThread().name}, $msg")

private fun myMethod() : Flow<Int> = flow {
    log("started")

    for (i in 1..3) {
        emit(i)
    }
}

fun main() = runBlocking {
    myMethod().collect { log("Collected: $it") }
}


