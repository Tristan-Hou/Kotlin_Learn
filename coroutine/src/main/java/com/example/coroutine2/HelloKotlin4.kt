package com.example.coroutine2

import kotlinx.coroutines.*

/*
    使用finally来关闭资源

    join与cancelAndJoin都会等待所有清理动作完成才会继续往下执行

    finally代码块中使用挂起函数会抛出CancellationException异常，原因是该代码块协程已经被取消了。
    如果非要在一个已经取消的协程中使用挂起函数，可以将相应的代码块放到withContext(NonCancellable){}中，使用withContext与NonCancellable上下文

 */
fun main() = runBlocking {
    val myJob = launch {
        try {
            repeat(100) { i ->
                println("job: I am sleeping ${i}")
                delay(500)
            }
        } finally {
            withContext(NonCancellable) {
                println("run finally block")
                delay(1000)
                println("after delay")
            }
        }
    }

    delay(1300)
    println("hello world")

    myJob.cancelAndJoin()
    println("welcome")
}