package com.example.coroutine4

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
    父子协程关系
    当一个协程是通过另外一个协程启动的，那么这个协程就会通过CoroutineScope.coroutineContext来继承其上下文信息，同时，新协程的Job就会成为父协程Job的一个孩子；当父协程被取消时，该父协程的所有孩子都会通过递归的方式一并取消执行

    特例：当我们使用GlobalScope来启动协程时，对于启动的新协程来说，其Job是没有父Job的。因此它就不会绑定到其所启动的那个范围上，所以它可以独立执行
 */
fun main() = runBlocking {
    val request = launch {
        GlobalScope.launch {              // (1)
            println("job1: hello")        // (3)
            delay(1000)
            println("job1: world")        // (4)
        }
        launch {                          // (2)
            delay(100)
            println("job2: hello")        // (5)
            delay(1000)
            println("job2: world")        // (6)
        }
    }

    delay(500)
    request.cancel()                      // (7)

    delay(1000)
    println("welcome")
}


