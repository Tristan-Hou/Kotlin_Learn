package com.example.coroutine5

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.runBlocking

/*
    限定数量的中间操作
 */
fun myNumbers() : Flow<Int> = flow {
    emit(1)
    println("hello world")
    emit(2)
    emit(3)
}

fun main() = runBlocking {
    myNumbers().take(2).collect { println(it) }
}

