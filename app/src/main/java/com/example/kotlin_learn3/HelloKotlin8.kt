package com.example.kotlin_learn3

fun main() {
    var i = 100
    var myObject = object {
        fun mythod() {
            i++
        }
    }

    myObject.mythod()
}