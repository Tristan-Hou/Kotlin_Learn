package com.example.coroutine5

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.zip
import kotlinx.coroutines.runBlocking

/*
    Flow组合
 */
fun main() = runBlocking {
    val nums = (1..5).asFlow()
    val strs = flowOf("one", "two", "three", "four", "five")

    nums.zip(strs) { a, b -> "$a -> $b"}.collect { println(it) }

}

