package com.example.coroutine4

import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

private fun log(logMessage: String) = println("[${Thread.currentThread().name}] $logMessage")

fun main() {
    newSingleThreadContext("Context1").use { ctx1 ->            // (1)
        newSingleThreadContext("Context2").use { ctx2 ->        // (2)
            runBlocking(ctx1) {                                       // (3)
                log("Started in Context1")                 // (4)

                withContext(ctx2) {                                   // (5)
                    log("Working in Context2")
                }

                log("Back to Context1")                    // (6)
            }

        }
    }
}