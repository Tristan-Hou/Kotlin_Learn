package com.example.kotlin_learn4

import kotlin.properties.Delegates

// 非空属性

class MyPerson {
    var address: String by Delegates.notNull()
    val name: String? = null
}

/*
 可观测属性
 */
class Person {
    var age: Int by Delegates.observable(20) {
        prop, oldValue, newValue ->  println("${prop.name}, $oldValue, newValue: $newValue")
    }
}

class Person2 {
    var age: Int by Delegates.vetoable(20) {
            _, oldValue, newValue -> when {
            oldValue <= newValue -> true
            else -> false
        }
    }
}

fun main() {
    val person = Person()
    person.age = 30
    person.age = 40
    println("~~~~~~~~~")

    val person2 = Person2()
    println(person2.age)

    person2.age = 40
    println(person2.age)

    person2.age = 30
    println(person2.age)


    println("~~~~~~~~~")
    val myPerson = MyPerson()

    myPerson.address = "suzhou"
    println(myPerson.address)
}
