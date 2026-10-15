package com.kodewala.cloning;

class Address{

	String line1;

	public Address(String _line1)
	{
		super();
		this.line1 = _line1;
	}
	
	public String toString()
	{
		return line1;
	}

}

class Employee implements Cloneable{

	String name;
	Address address;

	public Employee(String _name , Address _address)
	{
		super();
		this.name= _name;
		this.address = _address;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}






public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employee e1 = new Employee("Masood" , new Address("BTM 2nd Stage") );
		System.out.println("Name : " +e1.name + " and address line1 : "+e1.address);
		
		Employee e2 = (Employee) e1.clone();
		
		System.out.println("Name : " +e2.name + " and address line1 : "+e2.address);
	}

}
