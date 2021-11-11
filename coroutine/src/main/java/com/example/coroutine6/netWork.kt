package com.example.coroutine6

import kotlinx.coroutines.delay

class NetWork {
    
    
    suspend fun loadApi() {
        println("load begin")
        delay(10000)
        println("load end")
        40
    }
}

//abstract class Continuation<in T> : kotlin.coroutines.Continuation<T> {
//    abstract fun resume(value: T)
//    abstract fun resumeWithException(exception: Throwable)
//    override fun resumeWith(result: Result<T>) = result.fold(::resume, ::resumeWithException)
//}