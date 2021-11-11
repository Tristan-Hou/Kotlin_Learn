package com.example.kotlin_learn

class ThePerson(address: String, name: String) {

    val age: Int get() = 20

    var address: String = address
        get() {
            println("get invoked")
            return field
        }
        set(value) {
            println("set invoked")
            field = value
        }

    var name: String = name
        private set
        get
}

fun main() {
    var person = ThePerson("beijing", "zhangsan")

    println(person.age)
    println(person.address)

    person.address = "tianjin"
    println(person.address)

//    person.name = ""
//    println(person.name)
}