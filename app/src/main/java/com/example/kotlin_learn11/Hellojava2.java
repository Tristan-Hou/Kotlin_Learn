package com.example.kotlin_learn11;

public class Hellojava2 {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        // 无法通过new来创建kotlin编辑器自动生成的kt结尾的类的实例，因为字节码中没有构造函数
//        HelloKotlin2Kt kotlin2Kt = new HelloKotlin2Kt();
        HelloKotlin2Kt.tst();
        HelloKotlin2Kt.getStr();
        HelloKotlin2Kt.setStr("fuck");
//        new helloWorld();
    }
}
