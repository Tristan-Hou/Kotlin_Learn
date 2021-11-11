package com.example.kotlin_learn

class DD {
    fun method() {
        println("method")
    }
}

fun DD.fuck()  {
    println("fuck")
}

class EE {
    fun method2() {
        println("2222")
    }

    fun DD.hello() {
        method()
        method2()
    }

    fun world(dd: DD) {
        dd.hello()
    }

    fun DD.output() {
        println(toString())
        println(this.toString())
        println(this@EE.toString())
    }

    fun output() {
        println(this.toString())
    }

    fun test() {
        var dd = DD()
        dd.output()
    }
}

fun main() {
    var dd = DD()
    dd.method()
    dd.fuck()

    EE().test()
    EE().world(dd)
    EE().output()
}

// 扩展可以很好滴解决java中充斥的各种辅助类问题
// Collections.swap(list, 4, 10;
// list.swap(4, 10
