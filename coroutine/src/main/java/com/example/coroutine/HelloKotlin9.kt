package com.example.coroutine

import kotlin.concurrent.thread

fun main() {
    repeat(10000) {
        thread {
            Thread.sleep(100)
            println("A")
        }
    }
    println("Hello world")
}