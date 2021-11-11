package com.example.kotlin_learn

class EmptyClass

class MyClass0 (username: String) {

}

class MyClass00 private constructor(username: String) {

}

class MyClass constructor(username: String){
    init {
        println(username)
    }
    private val username : String = username.toUpperCase()

}

fun main(args: Array<String>) {
    var myClass = MyClass("zhangsan")
}