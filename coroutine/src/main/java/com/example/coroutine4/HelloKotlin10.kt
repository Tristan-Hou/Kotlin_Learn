package com.example.coroutine4

import kotlinx.coroutines.*

class Activity : CoroutineScope by CoroutineScope(Dispatchers.Default) {     // 委托CoroutineScope()工厂函数
    fun destroy() {
        cancel()
    }

    fun doSomething() {
        repeat(8) {
            launch {
                delay((it + 1) * 300L)
                println("Coroutine $it is finished")
            }
        }
    }
}

fun main() = runBlocking {
    val activity = Activity()
    activity.doSomething()

    println("start coroutines")
    delay(1300)

    println("destroy activity")
    activity.destroy()

    delay(5000)
}