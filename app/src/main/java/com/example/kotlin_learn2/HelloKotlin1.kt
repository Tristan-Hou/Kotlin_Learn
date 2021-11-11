package com.example.kotlin_learn2

// 数据类型 data class

// 数据类主构造方法至少有一个参数
// 所有的主构造方法参数都必须标记为var/val
/// 不能修饰open inner 抽象

// 编译器自动生成equal hashcode toString
// componentN方法对应着属性声明的顺序
data class Person (
    val name: String, var age: Int, var address: String
) {
    fun copy(name: String) {

    }

//    fun copy(name: String, age: Int, address: String) {
//
//    }
}

// person2 会生成无参的构造方法，提供了默认值（person1不会）
data class Person2(val name: String = "", val age: Int = 10, val address: String = "")

fun main() {
    val person = Person("zhangsan", 20, "beijing")
    println(person)

    val person1 = person.copy(address = "Hangzhou")
    println(person1)

    // componentN 解构输出
    val (name, age, address) = person
    println("$name, $age, $address")

    val person2 = Person2()
    println(person2)

    val person3 = person2.copy(name = "tom")
    println(person3)
}