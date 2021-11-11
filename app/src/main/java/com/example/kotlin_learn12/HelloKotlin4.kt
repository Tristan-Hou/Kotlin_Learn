package com.example.kotlin_learn12

import java.io.FileNotFoundException

/**
 * kotlin不存在checked exception
 */
class MyClass3 {

    @Throws(FileNotFoundException::class)
    fun method() {
        println("method invoked")
        throw FileNotFoundException()
    }
}