package com.example.kotlin_learn7

// 解构声明

data class MyResult( val result : String, val status: Int) {

}

fun myMethod() : MyResult {
    return MyResult("a", 1)
}

fun myMethod2(): Pair<String, Int> {
    return Pair("fuck", 2)
}

fun main() {
    val myResult = myMethod()
    myResult.result

    val (a, b) = myMethod()

    val (a2, b2) = myMethod2()

    println("~~~~~~~~~")

    val map = mapOf<String, String>("a" to "aa", "b" to "bb", "c" to "cc")
    for ((key, value) in map) {
        println("key: $key, value: $value")
    }

    println("~~~~~~~~~~~~")
    map.mapValues { entry -> "${entry.value} hello" }.forEach { println(it) }

    println("~~~~~~~~~~~")
    map.mapValues { (key, value) -> "$value world" }.forEach { println(it) }

    println("~~~~~~~~~~~~")
    map.mapValues { (_, value) -> "$value welcome" }.forEach { println(it)}

    println("~~~~~~~~~~~")
    map.mapValues { (_, value) : Map.Entry<String, String> -> "$value person" }.forEach { println(it)}

    println("~~~~~~~~~")
    map.mapValues { (_, value: String) -> "$value dog" }.forEach { println(it)}



}