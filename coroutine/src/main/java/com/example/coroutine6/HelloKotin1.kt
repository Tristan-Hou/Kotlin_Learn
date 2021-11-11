package com.example.coroutine6

import android.text.format.Time
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onCompletion

class test1 {

    suspend fun kotlinTest() {
        delay(5000)
        40
    }
}

fun main() = runBlocking {
//    viewModelScope.launch {
    val deferredList = mutableListOf<Deferred<*>>()
    val responseList = mutableListOf<Any?>()
    /*requests.forEach {
        val deferred = async { it.onRequest() }
        deferredList.add(deferred)
    }*/
    val time = System.currentTimeMillis()
    println("time + ${time}")
    val deferred0 = async {
        withContext(NonCancellable) {
            println("run finally block")
            delay(1000)
            println("after delay")
        }
    }
    val deferred1 = async {
        withContext(NonCancellable) {
            println("run111 finally block")
            delay(1000)
            println("after111 delay")
        }
    }
    deferredList.add(deferred0)
    deferredList.add(deferred1)

    deferredList.asFlow().catch { cause ->
        cause.printStackTrace()
    }.onCompletion {
//            mergeResponse(responseList)
    }.collect { deferred ->
        println("~~~~~~~~~~~~~")
        val response = deferred.await()
        if (response != null) {
            responseList.add(response)
        }
        println("++++++++++++++")

        println("time + ${System.currentTimeMillis() - time}")
    }
//    }
}

//public class A : HelloJava1(object : TestImpl {
//    override fun finish() {
//        TODO("Not yet implemented")
//    }
//
//    override fun error() {
//        TODO("Not yet implemented")
//    }
//
//}) {
//
//}