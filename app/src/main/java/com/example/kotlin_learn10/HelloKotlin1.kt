package com.example.kotlin_learn10

// kotlin 中数组是不变的（不可协变与逆变）
// 不可将array<String> 赋给 array<Any>

fun main() {
    val myArray = MyArray()
    val intArray = intArrayOf(1, 2, 3, 4, 5)   // int[]

    val s : Array<Int> = arrayOf(1, 2)         // Integer[]

    myArray.myArrayMethod(intArray)

    println("~~~~~~~~~~~~~")

    val array = arrayOf(1, 2, 3, 4)
    array[0] = array[0] * 2                    // 并不会调用set/ get方法
    for (x in array) {
        println(x)
    }

}