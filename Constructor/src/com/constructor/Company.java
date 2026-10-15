package com.constructor;

public class Company {
	String companyName ;
	
	Company (String name )
	{
		this.companyName = name;
	}

}

class Employee extends Company{
	
	String emp_Name ;
	int emp_Id ; 

	Employee(String _companyName , String _empName , int _empId) {
		super(_companyName);
		this.emp_Name  = _empName;
		this.emp_Id = _empId;
	}
	
	
	
//	@Override
//	public String toString() {
//		return emp_Name +"\n" +emp_Id +"\n"+companyName;
//	}



	public static void main(String[] args) {
		Employee employee = new Employee("XYZ","Masood",123);
		
		System.out.println(employee.companyName +"\n"+employee.emp_Name+"\n"+employee.emp_Id);
		//System.out.println(employee);
		
	}
	
}
