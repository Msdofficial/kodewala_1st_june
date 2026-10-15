package com.kodewala.stringbuilder;

public class HomeWorkQuery {
	
	
	public String queryConstructor(String department , int salary , String joining_Date) 
	{
	//	public  String QUERY =  "SELECT * FROM employees WHERE 1=1";
		StringBuilder finalQuery = new StringBuilder("SELECT * FROM employees WHERE 1=1");
		
		finalQuery.append(" AND department = "+department).append(" AND salary > "+salary)
		.append(" AND joining_date > "+joining_Date);
		
		
		return finalQuery.toString();
	}

}
