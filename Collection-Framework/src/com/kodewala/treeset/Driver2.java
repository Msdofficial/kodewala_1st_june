package com.kodewala.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Payment implements Comparable<Payment> {
	String payment_Id;

	public Payment(String payment_Id) {
		super();
		this.payment_Id = payment_Id;
	}

	@Override
	public int compareTo(Payment p) {
		int result = this.payment_Id.compareTo(p.payment_Id);
		return result;
	}
	
	
}

public class Driver2 {
	
	public static void main(String[] args)
	{
	     Set<Payment>  payment = new TreeSet<Payment>();
	     
	     Payment p1 = new Payment("HIASCA");
	     Payment p2 = new Payment("LQIWJD");
	     Payment p3 = new Payment("WLQDJ");
	     Payment p4 = new Payment("QWKILQ");
	     
	     payment.add(p1);
	     payment.add(p2);
	     payment.add(p3);
	     payment.add(p4);
	     
	     System.out.println(payment.size());
	     
	     Iterator<Payment> itr = payment.iterator();
	     
	     while(itr.hasNext())
	     {
	    	 Payment p = itr.next();
	    	 System.out.println(p.payment_Id);
	     }
	     
	}

}
