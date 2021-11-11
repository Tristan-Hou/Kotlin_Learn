package com.example.coroutine4

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
    Dispatchers.Unconfined 协程分发器会在调用者线程中去启动协程，但仅仅会持续到第一个挂起点
    当挂起结束后程序恢复执行时，它会继续协程代码的执行，但这时执行协程的线程是由之前所调用的挂起函数来决定的
    Dispatchers.Unconfined协程分发器适用于既不会消耗cpu时间，也不会更新任何共享数据的协程

    Dispatchers.Unconfined是一种高级机制，它对于某些特殊情况是很有帮助作用的：协程执行的分发是不需要的，或者会产生意料之外的副作用，这是因为写成中的操作必须要立刻执行

    平时几乎不会用到
 */
fun main() = runBlocking<Unit> {
    launch(Dispatchers.Unconfined) {
        println("Dispatchers.Unconfined, thread: ${Thread.currentThread().name}")
        delay(300)
        println("Dispatchers.Unconfined, thread: ${Thread.currentThread().name}")
    }

    launch {
        println("No param, thread: ${Thread.currentThread().name}")
        delay(500)
        println("No param, thread: ${Thread.currentThread().name}")
    }
}