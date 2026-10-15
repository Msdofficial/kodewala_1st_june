package com.kodewala.overriding;

class Test3 {

    void show(Integer x) {
        System.out.println("Integer");
    }

    void show(long x) {
        System.out.println("long");
    }

    void show(Object x) {
        System.out.println("Object");
    }

    public static void main(String[] args) {
        new Test3().show(10);
    }
}