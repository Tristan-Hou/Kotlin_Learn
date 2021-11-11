package com.example.coroutine4

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
    对于父子协程来说，父协程总是会等待期所有子协程的完成。
    对于父协程来说，它不必显示地去追踪由它所自动的所有子协程，同时也不必调用Job.join方法来等待子协程的完成
 */

fun main() = runBlocking {
    val request = launch {
        repeat(3) {
            launch {
                delay((it + 1) * 100L)
                println("Coroutine $it finish")
            }
        }
        println("hello")
    }

    request.join()
    println("world")
}