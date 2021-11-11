package com.example.kotlin_learn13

class MyTest<K, V> {
    var k: K? = null
    var v: V? = null
}

fun main() {
    val myTestClassType = MyTest::class
    println(myTestClassType.typeParameters)
}