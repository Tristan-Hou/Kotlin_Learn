package com.example.kotlin_learn2;

import com.example.kotlin_learn.Apple;

import java.util.ArrayList;
import java.util.List;

public class MyTest {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        List<Object> list2 = list;
//        list2.add(3);
//        String str = list2.get(0);
        List<Cat> cats = new ArrayList<>();
        List<? extends Animal> animals = cats;
//        animals.add(new Cat());
//        animals.add(new Animal());
//        animals.add(new Object());

        List<Animal> animals1 = new ArrayList<>();
        List<? super Animal> contravariantAnimal = new ArrayList<>();
        contravariantAnimal.add(new Cat());
        contravariantAnimal.add(new Animal());
//        contravariantAnimal.add(new Object());
//        Animal animal = contravariantAnimal.get(0);

        Object[] objs = new String[] {"hello", "world"};


        Parent<String> parent = new Parent<>("slsl");
        parent.get();

        Parent<String> parent1 = new Parent<>("lsls");
        Parent<? extends Object> t = parent1;

        Parent<? super String> tt = parent1;

    }
}

class Animal {

}

class LIngzhanglei extends Animal {

}

class Cat extends LIngzhanglei {

}

class Dog extends LIngzhanglei {

}

class Parent<T> {
    T t;
    public Parent(T t) {
        this.t = t;
    }

    T get() {
        return t;
    }
}
