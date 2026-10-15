package com.kodewala.intrface.lecture4;   // Marker Interface
/**
 * @author md.masood
 */
class Employee implements Cloneable{
	
		String name;
		String location;
		
		public Employee(String _name , String _location)
		{
			super();	
			this.name = _name;
			this.location = _location;
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException
		{
			return super.clone();
		}

}
/**
 * @author daksh.arya    --> Can't change anything of Employee class 
 */


public class Driver {
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Employee e1 = new Employee("Md Masood" , "BLR"); // created an object of Employee class.
		
		Employee e2 = (Employee) e1.clone(); // copied the object with the help of clone method.
		
		System.out.println(e2.name+  " --> " +e2.location);
	}

}
