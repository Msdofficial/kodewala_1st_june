package com.kodewala.strings;

// This code shows that a class can not be extended further if it is set as final.

 final class Test extends Object{
		public final  void doSomething() 
		{
			System.out.println("Test.doSomething() ");
		}
	}
 public class FinalKeywordExmpl { // Here Test can not be extended because it is final 
		
		public void doSomething() {
			System.out.println("FinalKeywordExmpl.doSomething()");
		}
}
 