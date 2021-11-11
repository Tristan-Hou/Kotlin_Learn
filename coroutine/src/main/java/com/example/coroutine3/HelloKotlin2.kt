package com.example.coroutine3

import android.util.Log
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

/*
    使用async与await实现并发

    async就像是launch一样，会开启一个单独的协程，可以与其他协程并发工作

    区别是，launch会返回一个Job，但是Job并不会持有任何结果值，而async会返回一个Deferred，这是一个轻量级的非阻塞的future，它代表一个promise，可以在稍后提供一个结果值

    可以通过在一个deferred值上调用await()方法来获取最终结果值，Deferred也是一个Job，因此可以在需要时对其进行取消
 */

fun main() {
    GlobalScope.launch(Dispatchers.Main) {
//        val elapsedTime = measureTimeMillis {
            val value1 = async { intValue1() }
            val value2 = async { intValue2() }

            val result1 = value1.await()
            val result2 = value2.await()

            println("$result1 + $result2 = ${result1 + result2}")
//        }

//        println("total time: $elapsedTime")
    }

    /*CoroutineScope(Dispatchers.Default).launch {
        val time1 = System.currentTimeMillis()

        val task1 = async(Dispatchers.IO) {
            delay(2000)
            Log.e("TAG", "1.执行task1.... [当前线程为：${Thread.currentThread().name}]")
            "one"  //返回结果赋值给task1
        }

        val task2 = async(Dispatchers.IO) {
            delay(1000)
            Log.e("TAG", "2.执行task2.... [当前线程为：${Thread.currentThread().name}]")
            "two"  //返回结果赋值给task2
        }

        Log.e(
            "TAG",
            "task1 = ${task1.await()}  , task2 = ${task2.await()} , 耗时 ${System.currentTimeMillis() - time1} ms  [当前线程为：${Thread.currentThread().name}]"
        )
    }*/
}

/*fun main() = runBlocking {
    val elapsedTime = measureTimeMillis {
        val value1 = async { intValue1() }
        val value2 = async { intValue2() }

        val result1 = value1.await()
        val result2 = value2.await()

        println("$result1 + $result2 = ${result1 + result2}")
    }

    println("total time: $elapsedTime")
}*/

private suspend fun intValue1(): Int {
    delay(2000)
    return 15
}

private suspend fun intValue2() :Int {
    delay(3000)
    return 20
}