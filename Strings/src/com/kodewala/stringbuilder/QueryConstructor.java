package com.kodewala.stringbuilder;

public class QueryConstructor {
	public static String QUERY = "Select * from employee";
	
	public String constructQuery(String emp_id , int salary) 
	{
		StringBuilder finalQuery = new StringBuilder(QUERY);
		
		if(emp_id != null) 
		{
			finalQuery.append(" where emp_id = "+emp_id);
		}
		else if(salary > 0) 
		{
			finalQuery.append(" where salary is > "+salary);
		}
		finalQuery.append(";");
		
		return finalQuery.toString();
	}
}


