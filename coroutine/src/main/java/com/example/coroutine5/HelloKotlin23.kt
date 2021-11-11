package com.example.coroutine5

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.runBlocking

/*
    Flow完成的声明式方法
    对于声明式方法来说，Flow提供了一个名为onCompletion中间操作，该操作会在Flow完成收集之后才会调用
 */
private fun myMethod() : Flow<Int> = (1..3).asFlow()

fun main() = runBlocking {
    myMethod().onCompletion { println("onCompletion") }
        .collect { println(it) }
}

