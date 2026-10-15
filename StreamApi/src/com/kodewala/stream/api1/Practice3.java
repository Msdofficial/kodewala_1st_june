package com.kodewala.stream.api1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 3.	Given a list of employees, use filter() to find employees with salary greater than 10 LPA 
// and map() to get only their names.

class Employee{
	
	String empName;
	double salary;
	
	public Employee(String _empName , double _salary)
	{
		this.empName = _empName;
		this.salary = _salary;
	}
	
	@Override
	public String toString()
	{
		return empName;
	}
}


public class Practice3 {
	
	public static void main(String[] args) 
	{
		List<Employee> employee = new ArrayList<Employee>();
		
		employee.add(new Employee("Masood", 10.5));
		employee.add(new Employee("Daksh", 11.0));
		employee.add(new Employee("Aditi", 8.0));
		employee.add(new Employee("Yuvraj", 7.0));
		employee.add(new Employee("Vikash", 9.5));
		employee.add(new Employee("Rimjhim", 6.0));
		
		List<String> output = employee.stream().filter(emp -> emp.salary > 10.0).map(emp -> emp.empName)
				.collect(Collectors.toList());
		
		System.out.println(output);
	}
	
	

}
