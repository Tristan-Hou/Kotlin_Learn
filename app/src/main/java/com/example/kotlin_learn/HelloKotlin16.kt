package com.example.kotlin_learn

open class MyParent {
    open val name: String = "parent"
}

class MyChild : MyParent() {
    override val name :String = "child"
}

fun main(args: Array<String>) {
    var myChild = MyChild()
    println(myChild.name)
    println("~~~~")

    var myChild3 = MyChild3()
    println(myChild3.name)
}

class MyChild2(override val name: String) : MyParent() {

}

open class MyParent3 {
    open fun method() {
        println("parent method")
    }

    open val name: String get() = "parent"
}

class MyChild3 : MyParent3() {
    override fun method() {
        super.method()
        println("child method")
    }

    override val name : String get() = super.name + " and child"
}