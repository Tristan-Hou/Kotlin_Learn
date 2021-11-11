package com.example.kotlin_learn;

public class HelloJava17 {

    public static void main(String[] args) {
        CC c = new CC();
        c.method();
    }

    interface AA {
        default void method() {
            System.out.println("A");
        }
    }

    static class BB {
        public void method() {
            System.out.println("B");
        }
    }

    static class CC extends BB implements AA {

    }
}
