package com.kodewala.overriding;
class Parent {

    int x = print("Parent Instance");

    Parent() {
        print("Parent Constructor");
    }

    int print(String msg) {
        System.out.println(msg);
        return 10;
    }
}

class Child extends Parent {

    int y = print("Child Instance");

    Child() {
        print("Child Constructor");
    }
}

public class Test {
    public static void main(String[] args) {
        new Child();
    }
}
