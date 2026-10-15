package com.kodewala.ecommerce.service;

import com.kodewala.ecommerce.exception.ProductNotFoundException;
import com.kodewala.ecommerce.model.Product;
import com.kodewala.ecommerce.repository.ProductRepository;

public class ProductService {
	
	ProductRepository productRepository = new ProductRepository();
	
	public void addProduct(Product product)
	{
		productRepository.save(product);
		System.out.println("Product added Successfully.");
	}
	
	public void viewById(String productId)
	{
		try {
		productRepository.findById(productId);
		}
		catch(ProductNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void viewAll()
	{
		try {
			productRepository.findAll();
			}
			catch(ProductNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		
	}

}
