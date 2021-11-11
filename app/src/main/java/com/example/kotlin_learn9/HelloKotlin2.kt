@file: JvmName("helloKotlin2")
package com.example.kotlin_learn9

import kotlin.reflect.KClass

// 注解有构造方法，可以接收参数
// 注解构造方法允许参数类型：原生类型、字符串string、classes（MyClass：class）、枚举、其他的注释、上述类型的数组类型
// kotlin注解参数不允许为可空类型，因为jvm不支持以null形式存储注解属性值
// 如果某个注解被用作其他注解的参数，那么其名字就不需要以@开头

annotation class MyAnnotation2(val str: String)

@MyAnnotation2("hello")
class MyClass4

annotation class MyAnnotation3(val str: String, val myAnnotation: MyAnnotation2)

@MyAnnotation3("test", MyAnnotation2("welcome"))
class MyClass5

// 如果需要将某个class作为注解参数，那么请使用kotlin class（KClass)
// kotlin编译器会自动将其转换为java class， 这样java代码可以正常看到注解与参数

annotation class MyAnnotation4(val arg1: KClass<*>, val arg2: KClass<out Any>)

@MyAnnotation4(String::class, Int::class)
class MyClass6

class MyClass7(@field: MyAnnotation val arg1: String,  // 注解 java field
               @get: MyAnnotation val arg2: String,    // java getter
               @param: MyAnnotation val arg3: String)  // java 构造方法参数




