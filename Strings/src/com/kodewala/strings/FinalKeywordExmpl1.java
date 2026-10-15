package com.kodewala.strings;

// This code shows that a child class method can not override a parent class method if that method is set as final.
class Test1 extends Object{
	
		final int num = 100; // final make this variable constant.
	
		public  void doSomething() 
		{
			// num = 200; we can not change the int num because it is set as final.
			System.out.println("Test.doSomething() ");
		}
	}
public class FinalKeywordExmpl1 extends Test1 { 
		
		public void doSomething() { // Here doSomething() can not over-ride the parent class method 
			                        //till parent method is set as final
			System.out.println("FinalKeywordExmpl.doSomething()");
		}
}
