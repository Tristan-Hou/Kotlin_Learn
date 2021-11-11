package com.example.coroutine2

import kotlinx.coroutines.*

/*
   有两种方式可以让计算代码变为可取消的

   1. 周期性调用一个挂起函数，改挂起函数会检查取消状态，比如使用yield函数

   2. 显示的检查取消状态 —— isActive扩扎属性
 */
fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime

        var i = 0

        while (isActive) {
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("job: I am sleepint ${i++}")
                nextPrintTime += 500L
            }
        }
    }

    delay(1300)
    println("hello world")

    job.cancelAndJoin()
    println("welcome")
}