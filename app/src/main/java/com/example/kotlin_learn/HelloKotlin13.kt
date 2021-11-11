package com.example.kotlin_learn

class Student (private val username: String, private val age: Int, private val address: String) {

    fun printInfo() {
        println("username: $username, age: $age, address: $address")
    }
}
class Student2 private constructor(username: String) {

}

class Student3 (var username: String = "shanghai") {
    fun a() {
        username = "lisi"
    }
}


fun main(args: Array<String>) {
    val student = Student("zhangsan", 20, "beijing")
    student.printInfo()

    var student3 = Student3()
    println(student3.username)

    student3 = Student3("lisi")
    println(student3.username)
}