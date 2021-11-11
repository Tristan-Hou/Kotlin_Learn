package com.example.kotlin_learn7

// Kotlin 严格区分可变集合与不可变集合
// 要清楚的一点是： 区分开可变集合的只读视图与实际上真正的不可变集合
fun main() {
    val stringList: MutableList<String> = mutableListOf("hello", "world", "hello world")
    val redOnlyView: List<String> = stringList
    // list 与 mutableList 不一样

    println(stringList)

    stringList.add("welcome")
    println(redOnlyView)

//    redOnlyView.clear()
    val strings: HashSet<String> = hashSetOf("a", "b", "c", "d")
    assert(strings.size == 4)

    // 只读类型是协变的，他只能用于读，而不可以修改
    val s = listOf(1, 2, 3)
    val s2 : List<Any> = s
    println("~~~~~~")

    // 快照
    val items = mutableListOf("a", "b", "c")
    val items2 = items.toList()
    items.add("d")

    println(items)
    println(items2)
}