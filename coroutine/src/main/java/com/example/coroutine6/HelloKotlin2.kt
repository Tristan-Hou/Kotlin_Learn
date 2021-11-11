package com.example.coroutine6

import com.example.coroutine6.HelloJava1.TestImpl
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val elapsedTime = measureTimeMillis {
        println("answer is: ${intSum()}")
    }

    println("total sum: $elapsedTime")
}

private suspend fun intSum() : Int = coroutineScope {
    val value1 = async { intValue1() }
    val value2 = async { intValue2() }

    value1.await() + value2.await()
}

private suspend fun intValue1(): Int {

    /*val java11 = HelloJava1( object : TestImpl {
        override fun finish() {
            println("aaaaaaaaaaaa")
        }

        override fun error() {
            TODO("Not yet implemented")
        }
    })
    java11.start()*/

//    val java2 = HelloJava2()
//    java2.susMethod()
    return 15
}

private suspend fun intValue2() :Int {
    val kotlin1 = test1()
    kotlin1.kotlinTest()
    return 20
}