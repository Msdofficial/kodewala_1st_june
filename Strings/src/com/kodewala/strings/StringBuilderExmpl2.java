package com.kodewala.strings;

public class StringBuilderExmpl2 {
	
	public String sendingEmail(String name , String item , String status , String delDate)
	{ 
		StringBuilder notification = new StringBuilder();
		
		notification.append(Driver1.MSG1).append(name).append(Driver1.MSG2).append(item)
		.append(Driver1.MSG3).append(status).append(Driver1.MSG4).append(delDate);
		
		return notification.toString();
	}

}
