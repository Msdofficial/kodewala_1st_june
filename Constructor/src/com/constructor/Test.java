package com.constructor;

 class A {
    static int x = initializeX(); //10
    int a = initializeA(); //20

    static {
       System.out.println("A Static Block 1");
    }

    {
        System.out.println("A Instance Block 1");
    }

    static {
        System.out.println("A Static Block 2");
    }

    {
        System.out.println("A Instance Block 2");
    }

    public A() {
        this(100);
        System.out.println("A Default Constructor");
    }

    public A(int value) {
    	super();
        System.out.println("A Parameter Constructor : " + value);

    }

    static int initializeX() {
        System.out.println("A Static Variable");
        return 10;
    }

    int initializeA() {
        System.out.println("A Instance Variable");
        return 20;
    }

    static void staticMethod() {
    	System.out.println("A Static Method");
    }

    void instanceMethod() {
    	System.out.println("A Instance Method");
    }

}

class B extends A {
	// static variable
    static int y = initializeY(); //30
    // instance variable 
    int b = initializeB();

    static {
        System.out.println("B Static Block 1");
    }

    {
    	System.out.println("B Instance Block 1");
    }

    static {
    	System.out.println("B Static Block 2");
    }
    
    {
        System.out.println("B Instance Block 2");
    }

    public B() {
        this("Java");
        System.out.println("B Default Constructor");
    }

    public B(String name) {
        System.out.println("B Parameter Constructor : " + name);
    }
    static int initializeY() {
        System.out.println("B Static Variable");
        return 30;
    }
    int initializeB() {
        System.out.println("B Instance Variable");
        return 40;
    }

   static void staticMethod() {
        System.out.println("B Static Method");
    }

    void instanceMethod() {
        System.out.println("B Instance Method");
    }
}
public class Test {

	static {
        System.out.println("Test Static Block");
    }

    {
        System.out.println("Test Instance Block");
    }

    public static void main(String[] args) {

    	System.out.println("Main Started");
        B.staticMethod();
        System.out.println("----------------");
        B obj1 = new B();
        System.out.println("----------------");
        B obj2 = new B("Spring");
        System.out.println("----------------");
        obj1.instanceMethod();
        System.out.println("----------------");
        A ref = new B();
        System.out.println("----------------");
        ref.instanceMethod();
        System.out.println("----------------");
        System.out.println(A.x);
        System.out.println(B.y);
        System.out.println("Main End");
     }
}

