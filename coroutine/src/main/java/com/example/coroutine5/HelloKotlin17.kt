package com.example.coroutine5

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/*
    buffer的主要作用在于对发射的换冲，减少等待时间

    buffer与flowOn之间存在一定的关系

    实际上，flowOn运算符在本质上在遇到需要改变CoroutineDispatcher时也会使用同样的缓冲机制，只不过该实例没有改变执行上下文而已
 */
private fun myMethod() : Flow<Int> = flow {
    for (i in 1..4) {
        delay(100)          // 模拟耗时操作，耗时操作之后才开始流元素的发射
        emit(i)
    }
}

fun main() = runBlocking {
    val time = measureTimeMillis {
        myMethod()/*.buffer()*/.collect {
            delay(200)
            println(it)
        }
    }

    println(time)
}