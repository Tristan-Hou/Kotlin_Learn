package com.example.coroutine5

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

/*
    Flow中间运算符

    Flow的中间运算符思想与Java Stream完全一致

    Flow与Sequence之间在中间运算符上的重要区别在于：对于Flow来说，这些中间运算符内的代码块是可以调用suspend挂起函数的
 */

private suspend fun myExecution(input : Int) : String {
    delay(1000)
    return "output: $input"
}

fun main() = runBlocking {
    (1..10).asFlow().filter { it > 5 }.map { myExecution(it) }.collect { println(it) }
}


