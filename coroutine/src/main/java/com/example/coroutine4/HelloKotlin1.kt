package com.example.coroutine4

import kotlinx.coroutines.*
import java.util.concurrent.Executors

/*
    协程与线程之间的关系

    协程上下文与分发器（Coroutine Context与Dispatcher）

    协程总是会在某个上下文中执行，这个上下文实际上是由CoroutineContext类型的一个实例来表示的，该实例由Kotlin标准库来定义

    协程上下文本质上是各种元素所构成的一个集合。其中，主要的元素包括协程的Job以及分发器

    分发器主要功能就是确定由哪个线程来执行我们所指定的协程代码

    协程上下文包含了一个协程分发器（CoroutineDispatcher），协程分发器确定了到底由哪个线程或者线程池来执行我们所指定的协程。
    协程分发器可以将协程的执行限制到一个具体指定的线程，也可以将协程的执行分发到一个线程池中，由线程池中的某个线程来执行我们所指定的协程，
    还可以不加任何限制的去执行我们所指定的协程代码（此时，我们所制定的协程代码到底是由哪个线程来执行的是不确定的，它需要根据程序的实际执行情况才能确定，此种情况的协程分发器较少使用）

    所有的协程构建器（Coroutine Builder）如launch和async都会接收一个可选的CoroutineContext参数，这参数可用于显示指定新协程所运行的分发器以及其他上下文元素


    程序分析：
    1.当通过launch来启动协程并且不指定协程分发器时，它会继承启动它的那个CoroutineScope的上下文与分发器，对于该实例来说，它会继承runBlocking的上下文，而runBlocking则是运行在main线程当中

    2. Dispatchers.Unconfined是一种很特殊的协程分发器，它在该示例中也是运行在main线程中。但实际上，其运行机制与不指定协程分发器时是完全不同的

    3. Dispatchers.Default是默认分发器，当协程是通过GlobalScope来启动的时候，它会使用默认的分发器来启动协程，这会使用一个后台的共享线程池来运行我们的协程代码。因此，launch(Dispatchers.Default)等价于GlobalScope.launch{ }

    4. Executors.newSingleThreadExecutor().asCoroutineDispatcher()创建一个单线程的线程池，该线程池中的线程用于运行指定协程代码。
    实际开发中，使用专门的线程来执行协程代码的代价是非常高德，因此在协程代码执行完毕后，我们必须要释放相应的资源。
    这里就需要使用close方法来关闭相应的协程分发器，从而释放掉资源；
    也可以将协程分发器存储到一个顶层变量中，以便在程序的其他地方进行复用
 */

fun main() = runBlocking<Unit> {
    launch {
        println("No params, thread: ${Thread.currentThread().name}")
    }
    launch(Dispatchers.Unconfined) {
//        delay(100)
        println("Dispatchers.Unconfined, thread: ${Thread.currentThread().name}")
//        delay(100)
    }
    launch(Dispatchers.Default) {
        println("Dispatchers.Default, thread: ${Thread.currentThread().name}")
    }

    val thread = Executors.newSingleThreadExecutor().asCoroutineDispatcher()
    launch(thread) {
        println("single thread executor, thread: ${Thread.currentThread().name}")
        thread.close()
    }
    GlobalScope.launch {
        println("GlobalScope.launch, thread: ${Thread.currentThread().name}")
    }
}



