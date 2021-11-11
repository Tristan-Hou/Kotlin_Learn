package com.example.kotlin_learn11

import android.os.Parcel
import android.os.Parcelable

open class Person(open var aaa: Int) {
    var name: String = "zhangsan"

    // 实例字段 instance field —— kotlin编译器不会为其生成getter/setter方法
    @JvmField
    var age: Int = 20
    @JvmField
    var test :Int = 1

    fun getAge():Int {
        return age
    }
}

/*class Str( aaa: Int): Person(aaa) {

}*/

class myFiled() {
    var adress: String = "ss"
}

@JvmField
var myFiledVar : myFiled = myFiled()

fun main() {
//    val person = Person()
//    println("age : ${person.age}")
//    person.age = 33
//    println("age : ${person.age}")

    println("~~~~~~~~")
    println("age : ${myFiledVar.adress}")
    myFiledVar = myFiled()
    myFiledVar.adress = "iwiw"
    println("age : ${myFiledVar.adress}")
}