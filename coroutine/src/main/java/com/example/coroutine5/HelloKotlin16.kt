package com.example.coroutine5

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/*
    Buffer换冲


 */

private fun myMethod() : Flow<Int> = flow {
    for (i in 1..4) {
        delay(100)          // 模拟耗时操作，耗时操作之后才开始流元素的发射
        emit(i)
    }
}

fun main() = runBlocking {
    val time = measureTimeMillis {
        myMethod().collect {
            delay(200)
            println(it)
        }
    }

    println(time)
}