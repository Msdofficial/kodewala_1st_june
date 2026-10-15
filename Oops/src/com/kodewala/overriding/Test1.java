package com.kodewala.overriding;

public class Test1 {

    void show(long x) {    // Widening primitive 
        System.out.println("long"); 
    }

    void show(Integer x) {      // Boxing
        System.out.println("Integer");
    }
    
//    void show(int x) {
//        System.out.println("Int");     // exact match 
//    }
    void show(Object x) {
        System.out.println("Object");
    }
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.show(10);
    }
}
