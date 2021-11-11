package com.example.kotlin_learn2

/*
    kotlin 声明处协变
    java 使用处协变
 */

interface Producer<out T> {
    fun produce(): T
}

interface Consumer<in T> {
    fun consumer(item: T)
}
interface ProducerConsumer<T> {
    fun product(): T
    fun consumer(item: T)
}

open class Fruit

open class Apple: Fruit()

class ApplePeer: Apple()

class FruitProducer: Producer<Fruit> {
    override fun produce(): Fruit {
        println("produce Fruit")
        return Fruit()
    }
}

class AppleProducer: Producer<Apple> {
    override fun produce(): Apple {
        println("produce Apple")
        return Apple()
    }
}

class ApplePeerProducer: Producer<ApplePeer> {
    override fun produce(): ApplePeer {
        println("produce ApplePeer")
        return ApplePeer()
    }
}

fun main() {
    val producer1 : Producer<Fruit> = FruitProducer()
//    val producer2 : Producer<ApplePeer> = AppleProducer()
    val producer2 : Producer<Fruit> = AppleProducer()
    val producer3 : Producer<Fruit> = ApplePeerProducer()
    producer2.produce()

    val consumer1: Consumer<ApplePeer> = Human()
    val consumer2: Consumer<ApplePeer> = Man()
    val consumer3: Consumer<ApplePeer> = Boy()
    consumer2.consumer(ApplePeer())
}

class Human: Consumer<Fruit> {
    override fun consumer(item: Fruit) {
        println("consume Fruit")
    }
}

class Man: Consumer<Apple> {
    override fun consumer(item: Apple) {
        println("consume apple")
    }
}

class Boy: Consumer<ApplePeer> {
    override fun consumer(item: ApplePeer) {
        println("consume applePeer")
    }
}