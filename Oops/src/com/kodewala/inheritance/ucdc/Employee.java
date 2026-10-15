package com.kodewala.inheritance.ucdc;

// Note : When Parent class object want to refer child class object , it can access it , known as Up-Casting 
//        While, Child class object can not directly access it , but can do so using Down_Casting.

public class Employee extends Object {
	
}

class Manager extends Employee{
	
	public static void main(String[] args) 
	{
		
		
		// auto Up-Casting 
		
		Employee e1 = new Manager();    // here we do not have to mention (Employee) before new because it is auto Up-Casting
		
		// Down-Casting
		
		Manager m1 = (Manager) e1;    // error --> Type mismatch: cannot convert from Employee to Manager ,
		                                          // Hence we have to manually Down-Cast it using (Manager) before new.
	}
	
}
