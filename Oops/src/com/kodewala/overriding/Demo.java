package com.kodewala.overriding;

class A {

    static {
        System.out.println("A Static");
    }

    int x = 10;

    A() {
        show();
    }

    void show() {
        System.out.println("A Show " + x);
    }

    static void print() {
        System.out.println("A Print");
    }
}

class B extends A {

    static {
        System.out.println("B Static");
    }

    int x = 20;

    B() {
        System.out.println("B Constructor");
    }

    @Override
    void show() {
        System.out.println("B Show " + x);
    }

    static void print() {
        System.out.println("B Print");
    }
}

public class Demo {

    public static void main(String[] args) {

        A obj = new B();

        obj.print();
        obj.show();
    }
}
