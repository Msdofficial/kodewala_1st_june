package com.kodewala.inheritance.overriding;

class Product{
	String type;
	
	public int display()
	{
		System.out.println("This is a generic Prodct : ");
		return 20;
	}
}

public class ElectronicsProduct extends Product {
	
	@Override
	public int display()   // This is method overriding .
	{
		System.out.println("This is an Electronic Product. ");
		return 30;
	}
	
	public static void main(String[] args)
	{
		ElectronicsProduct p1 = new ElectronicsProduct();
		
		System.out.println(p1.display());
		
		
	}

}
