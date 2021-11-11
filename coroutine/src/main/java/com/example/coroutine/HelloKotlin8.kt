package com.example.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
    协程是轻量级的 线程由底层操作系统进行管理和创建，因此每个操作系统的线程数量是又上限的
    协程的数量是无上限的，比线程更轻
 */

fun main() = runBlocking {
    repeat(10000) {
        launch {
            delay(100)
            println(it)
            println("A")
        }
    }
    println("Hello world")
}