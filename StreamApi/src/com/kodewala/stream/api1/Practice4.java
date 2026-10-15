package com.kodewala.stream.api1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 4. Given a list of products, use filter() to find products with price greater than 10,000
//    and map() to apply a 10% discount.


class Product{
	
	String prodName;
	int price;
	
	public Product(String _prodName , int _price)
	{
		this.prodName = _prodName;
		this.price = _price;
	}
	
	@Override
	public String toString()
	{
		return prodName;
	}
}


public class Practice4 {
	
	public static void main(String[] args) 
	{
		List<Product> products = new ArrayList<Product>();
		
		products.add(new Product("iPhone", 12000));
		products.add(new Product("samsung", 11000));
		products.add(new Product("huwai", 10000));
		products.add(new Product("vivo", 9000));
		products.add(new Product("nokia", 8000));
		products.add(new Product("micromax", 7000));
		
		List<Integer> output = products.stream().filter( prod -> prod.price > 10000)
				.map(prod -> prod.price - (prod.price * 10)/100).collect(Collectors.toList());
				
		
		System.out.println(output);
	}
	
	

}
