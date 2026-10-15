package com.kodewala.inheritance;

public class Mens extends Clothing {

		String size;
		String colour;
		String fit;
		
		Mens(String _size ,String _colour , String _fit)
		{
			this.size = _size;
			this.colour = _colour;
			this.fit = _fit;
		}
		
		
		public static void main(String[] args) {
			Mens mens = new Mens("Medium","Black", "Regular Fit");
			
			System.out.println(mens.type2);
			System.out.println(mens.cust_Type2);
			System.out.println(mens.size);
			System.out.println(mens.colour);
			System.out.println(mens.fit);
		}
}
