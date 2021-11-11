package com.example.kotlin_learn2

// star projection (星投影)

class Star<out T>(private var t: T) {
    fun getValue(): T {
        return t
    }
}

class Star2<in T> {
    fun setValue(t: T) {

    }
}

class Star3<T>(private var t: T) {
    fun setValue(t: T) {

    }

    fun getValue(): T {
        return this.t
    }
}

fun main() {
    val star: Star<Number> = Star<Int>(4)
    val star2: Star<*> = star
    var a = star2.getValue()

    val star3: Star2<Int> = Star2<Number>()
    val star4: Star2<*> = star3
//    star4.setValue(3)

    val star5: Star3<String> = Star3<String>("hello")
    val star6: Star3<*> = star5
    star6.getValue()

    val list: MutableList<*> = mutableListOf("hello", "world", "hello world")
    println(list[0])
//    list[0] = "test"

}