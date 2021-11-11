package com.example.kotlin_learn3

class OuterClass4 {
    class NestedClass4 {
        init {
            println("nestedClass构造")
        }
    }
}

fun main() {
    val nestedClass4 : OuterClass4.NestedClass4 = OuterClass4.NestedClass4()

}