package com.example.coroutine

fun main() {
    test(5, action = {
        println("Test 1")
    })

    test2(5, action = {
        println("test 2 + $it")
    })

    test(5, ::test3)

    test2(5, ::test4)

    test5(5, ::test6)
}


fun test(x: Int, action :() -> Unit) {

}

fun test2(x: Int, action: (Int) -> Unit) {
    action(x)
}

fun test3() {

}

fun test4(x: Int) {

}

fun test5(x: Int, action: (Int, Int) -> Unit) {
    action(1, 2)
}

fun test6(x: Int, y: Int) {
    println(x + y)
}