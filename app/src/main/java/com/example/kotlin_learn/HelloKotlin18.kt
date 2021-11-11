package com.example.kotlin_learn

open class BaseCLass {
    open fun method() {

    }
}

abstract class ChildClass : BaseCLass() {
    override abstract fun method()
}