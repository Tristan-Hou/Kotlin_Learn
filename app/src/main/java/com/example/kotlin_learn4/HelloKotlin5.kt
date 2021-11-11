package com.example.kotlin_learn4

import java.util.*

class Student(map: Map<String, Any?>) {
    val name: String by map
    val address: String by map
    val age: Int by map
    val birthday: Date by map
}

class Student2(map: MutableMap<String, Any?>) {
    var address: String by map
}

fun main() {
    val student = Student(mapOf(
        "name" to "zhangsan",
        "address" to "beijing",
        "age" to 20,
        "birthday" to Date()
    ))
    println(student.name)
    println(student.address)
    println(student.age)
    println(student.birthday)
    println("~~~~~~")

    val map = mutableMapOf<String, Any?>(
        "address" to "beijing"
    )
    val student2 = Student2(map)
    println(student2.address)
    println(map["address"])

    println("~~~~~~")
    student2.address = "shanghai"
    println(student2.address)
}