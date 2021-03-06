package com.example.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/*
    全局协程类似于守护线程

    使用GlobalScope启动的协程并不会保持进程的声明，他们就像是守护线程一样
 */

fun main() {
    GlobalScope.launch {
        repeat(100) {
            println("i am sleeping $it")
            delay(400)
        }
    }
    Thread.sleep(2000)
}