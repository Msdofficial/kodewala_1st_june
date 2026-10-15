package com.kodewala.hashset2.treeify;
import java.util.HashSet;
import java.util.Set;
class Product1
{
	String product ;
	 
	 public Product1(String _product) {
		this.product =_product;
	 }
	 @Override
	 public int hashCode() 
	 {
		 return 2345678;
	 }
	
}
public class Driver3 {
	
	public static void main(String[] args) {
		Set<Product1> products = new HashSet<Product1>();
		
	//	System.out.println(products.size());
		
		
		Product1 p1 = new Product1("iPhone");
		Product1 p2 = new Product1("iPhone");
		Product1 p3 = new Product1("iPhone");
		Product1 p4 = new Product1("iPhone");
		Product1 p5 = new Product1("iPhone");
		Product1 p6 = new Product1("iPhone");
		Product1 p7 = new Product1("iPhone");
		Product1 p8 = new Product1("iPhone");
		Product1 p9 = new Product1("iPhone");
		
		
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		products.add(p8);
		products.add(p9);
		
		
		System.out.println(products.size());
	}

}

