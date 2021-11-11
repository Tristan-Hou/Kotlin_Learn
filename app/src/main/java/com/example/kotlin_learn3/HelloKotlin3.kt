package com.example.kotlin_learn3

class Person(val name: String, var age: Int) {

    private val str: String = "person属性"

    private inner class PersonFeature(var height: Int, var weight: Int) {
        private val str: String = "personFeature属性"
        fun getPersonFeature() {
            val str: String = "局部变量"
            println("shengao: $height, tizhong: $weight")
            println("${this@Person.str}")
            println("${this.str}")
            println(str)

            this@Person.method()
        }
    }

    private fun method() {
        println("执行了person的method方法")
    }

    fun getPerson() {
        var personFeature = PersonFeature(120, 180)
        personFeature.getPersonFeature()

    }
}

fun main() {
    var person = Person("zhangsan", 20)
    person.getPerson()
}