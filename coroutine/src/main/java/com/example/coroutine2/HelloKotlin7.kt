package com.example.coroutine2

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

/*
    由withTimeout函数调用所跑出的TimeoutCancellationException异常是CancellationException的子类
    当该异常抛出时我们并未在控制台上看到整个一场堆栈信息，这是因为在取消的协程当中，CancellationException被认为是一种协程完成的正常原因而已

    不过我们在该实例中，是在main中使用了withTimeout函数调用

    既然CancellationException仅仅只是个异常而已，所有的资源都会以通常的方式来关闭，那么我们就可以将相关代码放到一个try...catch块中
    此外，kotlin还提供了一个更加友好的函数调用：withTimeoutOrNull，从功能角度来看，它非常类似于withTimeout，不过当前超时发生时，并不会抛出CancellationException异常，而是会直接返回null
 */
fun main() = runBlocking {
    val result = withTimeoutOrNull(1900) {
        repeat(1000) { i ->
            println("hello, $i")
            delay(900)
        }

        "hello world"
    }
    println("result is $result")
}