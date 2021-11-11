package com.example.kotlin_learn2

class ParameterizedClass<A>(private val value: A) {
    fun getValue() :A {
        return this.value
    }
}

class ParameterizedProducer<out T>(private val value: T) {
    fun get() :T{
        return this.value
    }
}

class ParameterizedConsumer<in T> {
    fun toString(value: T) :String {
        return value.toString()
    }
}

fun main() {
    val parameterizedClass = ParameterizedClass("hello world")
    var result = parameterizedClass.getValue()

    assert(result is String)

    val parameterizedProducer = ParameterizedProducer("welcome")
    val myRef: ParameterizedProducer<Any> = parameterizedProducer

    assert(myRef is ParameterizedProducer<Any>)

    val parameterizedConsumer = ParameterizedConsumer<Number>()
    val myRef2: ParameterizedConsumer<Int> = parameterizedConsumer
    assert(myRef2 is ParameterizedConsumer<Int>)
}