package com.example.coroutine2

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

/*
    在使用协程时，如果取消了协程，那么很大一部分原因都在于协程的执行时间超过了某个设定值；
    我们可以通过手工引用与协程对应的job的方式来启动一个单独的协程用于取消这个协程
    不过Kotlin提供了一个内建的函数来帮助我们又快又好的做到这一点
 */
fun main() = runBlocking {
    withTimeout(1900) {
        repeat(1000) { i ->
            println("hello, $i")
            delay(800)
        }
    }
}