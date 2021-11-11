package com.example.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
    被suspend关键字所修饰的函数叫挂起函数

    挂起函数可以普通函数一样用在协程中，不过他的一个特性在于可以使用其他挂起函数

    挂起函数只能用在协程或者另外一个挂起函数中
 */
fun main() = runBlocking {
    launch {
        world()
    }
    println("welcome")
}

suspend fun hello() {
    delay(1000)
    println("hello world")
}

suspend fun world() {
    hello()
}