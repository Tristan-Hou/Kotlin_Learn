package com.example.coroutine4

import kotlinx.coroutines.Job
import kotlinx.coroutines.runBlocking

/*

    -Dkotlinx.coroutines.debug
    Job的使用方式以及在Context中的具体应用

    协程的Job是归属于其上下文（Context）的一部分，Kotlin为我们提供了一种简洁的手段来通过协程上下文获取到协程自身的Job对象

    coroutineContext[Job]以表达式形式访问上下文中的Job对象
 */
fun main() = runBlocking<Unit> {
    val job : Job? = coroutineContext[Job]
    println(job)
}


