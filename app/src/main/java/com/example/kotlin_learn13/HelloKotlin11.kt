package com.example.kotlin_learn13

import kotlin.reflect.KClass

fun main() {
    val kotlinLang = "kotlin"
    val kclass : KClass<out String> = kotlinLang::class
    println(kclass)

    println("~~~~~~~~~~~")

    val kclassDataType : KClass<String> = String::class
    println(kclassDataType)

    val kclass1: KClass<out String> = "kotlin"::class
    val kclass2: KClass<out String> = "java"::class
    val kclass3: KClass<out String> = "ruby"::class
    println(kclass)
    println(kclass1)
    println(kclass2)
    println(kclass3)
    println(kclass1 == kclass2)

    println("~~~~~~~~~~~")

    val kclass4 = Class.forName("java.util.Date").kotlin
    println(kclass4)

    println(kclass4 == Class.forName("java.util.Date"))
    println(kclass4 == Class.forName("java.util.Date").kotlin)
}