package com.example.kotlin_learn4

import java.lang.Exception
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class PropertyDelegate : ReadOnlyProperty<People, String> {
    override fun getValue(thisRef: People, property: KProperty<*>): String {
        return "hello world"
    }
}

class PeopleLauncher {
    operator fun provideDelegate(thisRef: People, propety: KProperty<*>) : ReadOnlyProperty<People, String> {
        println("welcome")
        when (propety.name){
            "name", "address" -> return PropertyDelegate()
            else-> throw Exception("not valid name")
        }
    }
}

class People {
    val name: String by PeopleLauncher()
    val address:String by PeopleLauncher()
}

fun main() {
    val people = People()
    println(people.name)
    println(people.address)
}