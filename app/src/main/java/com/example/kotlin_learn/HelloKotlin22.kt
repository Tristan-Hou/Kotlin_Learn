package com.example.kotlin_learn

fun method() {

}

class Class

open class Class1 {
    private val b = 3;

    protected open val c = 4;

    internal val d = 5;
}

class subClass : Class1() {

}

class Class2 {
    fun method() {
        println(Class1().d)
    }
}