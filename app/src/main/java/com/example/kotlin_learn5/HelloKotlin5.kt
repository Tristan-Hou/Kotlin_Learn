package com.example.kotlin_learn5

// 高阶函数 higher-order 与lambda
// lambda 总是被一堆花括号包围，其参数位于-> 之前（参数类型可以省略）执行体位于-> 之后

var multiply: (Int, Int) -> Int = { a: Int, b: Int -> a * b}
val add: (Int, Int) -> Int = {a, b -> a + b}
val subtract = {a: Int, b: Int -> a - b}
val myAction = { println("hello world")}

val mayReturnNull: (Int, Int) -> Int? = { _, _ -> null }

fun main() {
    println(multiply(3, 4))
    println(multiply)
}


