package com.kodewala.hashset1;
import java.util.HashSet;
import java.util.Set;
class Product
{
	String product ;
	 
	 public Product(String _product) {
		this.product =_product;
	 }
	 @Override
	 public int hashCode() 
	 {
		 return this.product.hashCode();
	 }
	 @Override
	 public boolean equals(Object obj) 
     {
		 Product p = (Product)obj;
		 return this.product.equals(p.product);
	 }
	
}
public class Driver2 {
	
	public static void main(String[] args) {
		Set<Product> products = new HashSet<Product>();
		
		Product p1 = new Product("iPhone");
		Product p2 = new Product("iPhone");
		
		
		products.add(p1);
		products.add(p2);
		
		System.out.println(products.size());
	}

}
