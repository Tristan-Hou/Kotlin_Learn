package com.example.coroutine5

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking

/*
    Flow完成

    Kotlin提供两种方式实现Flow的完成

    1. 命令式
    2. 声明式
 */

private fun myMethod() : Flow<Int> = (1..3).asFlow()

fun main() = runBlocking {
    try {
        myMethod().collect { println(it) }
    } finally {
        println("finally")
    }
}
