package com.example.coroutine3

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.lang.Exception

/*
    父子协程的异常与取消问题

    当协程之间存在父子关系时，不管是取消还是异常，都会沿着协程的层次体系向上进行传播
 */

fun main() = runBlocking<Unit> {
    try {
        failureComputation()
    } finally {
        println("computation failed")
    }
}

private suspend fun failureComputation() : Int = coroutineScope {
    val value1 = async<Int> {
        try {
            delay(9000000)
            50
        } finally {
            println("value1 was cancelled")
        }
    }

    val value2 = async<Int> {
        Thread.sleep(2000)
        println("value2 throws an exception")

        throw Exception()
    }

    value1.await() + value2.await()
}