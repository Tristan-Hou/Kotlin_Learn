package com.example.kotlin_learn13

/*
    属性引用 property reference
    与函数、方法引用用法完全一致::

    ::a 表示类型KProperty<Int>的属性对象，可以通过get()获取其值，也可以通过name获取其名字
    ::b 可变属性，返回的是KMutableProperty<Int>的值，拥有一个set()
 */
fun main() {
    println(::a)
    println(::a.get())
    println(::a.name)

    println("~~~~~~~~~~~~")

    ::b.set(10)
    println(::b)
    println(::b.get())
    println(::b.name)
}

const val a = 3

var b = 5

