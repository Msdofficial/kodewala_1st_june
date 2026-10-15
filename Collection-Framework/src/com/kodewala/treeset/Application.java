package com.kodewala.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Product implements Comparable<Product>{
	String product_id;
	String name;
	int price;
	String status;
	
	public Product(String product_id, String name, int price, String status) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.price = price;
		this.status = status;
	}
	@Override
	public int compareTo(Product p) {
		int result = Integer.compare(price, p.price);
		
		if(result == 0) 
		{
			return this.product_id.compareTo(p.product_id);
		}
		return result;
	}
	
	
}
public class Application {
	
	public static void main(String[] args) 
	{
		Set<Product> product = new TreeSet<Product>();
		
		Product p1 = new Product("HAHSJ","iPhone",5000 ,"xyz");
		Product p2 = new Product("HSEFSJ","iPhone",5000 ,"xy");
		Product p3 = new Product("HQWDSJ","Samsung",4000 ,"xyz");
		Product p4 = new Product("HQWSJ","Vivo",3000 ,"xz");
		Product p5 = new Product("HSEFSJ","iPhone",5000 ,"xy");
		
		product.add(p1);
		product.add(p2);
		product.add(p3);
		product.add(p4);
		product.add(p4);
		
		
		
		Iterator<Product> itr = product.iterator();
	     
	     while(itr.hasNext())
	     {
	    	 Product p = itr.next();
	    	 System.out.println(p.price+ " ; "+p.name+ " ; " +p.product_id+ " ; " +p.status);
	     }
	      
	}

}
