package com.example.kotlin_learn3

/*
 匿名对象只能在局部对象范围内或被private修饰的成员变量范围内才能被真正识别
 如果将匿名对象当做一个public方法的返回类型或者public属性的类型，那么该方法的真正类型就是该匿名对象生命的父类型
 如果没有任何父类型，那么就是Any。在这种情况下，匿名对象所声明的任何成员都是无法访问的
 */
class MyClass {
    private var myObject = object {
        fun output() {
            println("output invoked")
        }
    }

    fun myTest() : Any {
        println(myObject.javaClass)
        println(myObject::class.java)
        myObject.output()
        return myObject
    }
}

class MyClass2 {
    private fun method1() = object {
        var str = "hello"
    }

    internal fun method2() = object {
        var sta = "world"
    }

    fun test() {
        val str = method1().str
//        val str2 = method2().
    }
}

fun main() {
    var myClass = MyClass()
    myClass.myTest()
}