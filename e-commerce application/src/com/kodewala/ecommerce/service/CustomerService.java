package com.kodewala.ecommerce.service;

import com.kodewala.ecommerce.exception.CustomerNotFoundException;
import com.kodewala.ecommerce.model.Customer;
import com.kodewala.ecommerce.repository.CustomerRepository;

public class CustomerService {

	CustomerRepository customerRepository = new CustomerRepository();

	public void registerCustomer(Customer customer) {
		customerRepository.save(customer);
		System.out.println("Customer saved to DB successfully");
	}

	public void viewAllCustomers(){
		try {
			customerRepository.findAll();
		} catch (CustomerNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}

	public void searchCustomerById(String customerId) {
		try {
			customerRepository.findById(customerId);
		} catch (CustomerNotFoundException e) {
			System.err.println(e.getMessage());
		}

	}

}
