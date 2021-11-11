package com.example.kotlin_learn

fun main(args: Array<String>) {
    var m = "Fuck"
    println(convert2Uppercase("hello $m"))
}

fun convert2Uppercase(str: Any) :String?{
    if (str is String) {
        return str.toUpperCase()
    }
    return null
}