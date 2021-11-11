package com.example.coroutine4

import kotlinx.coroutines.*


fun main() = runBlocking<Unit>(CoroutineName("runBlockingCoroutine")) {
    launch(Dispatchers.Default + CoroutineName("launchCoroutine")) {
        println("thread: ${Thread.currentThread().name}")
    }
    println("thread: ${Thread.currentThread().name}")
}