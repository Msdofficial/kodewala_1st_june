package com.kodewala.intrface.lecture5;  // functional interface & lambda function

// we write @FunctionalInterface  annotation just to make sure that we can't write more than one abstract method
//by mistake. if we will do so, there will be an error near 'Payment' that 'Payment' is no more functional interface.

@FunctionalInterface 
public interface Payment {
	
	// functional interface can only have one abstract method , otherwise it will not be functional interface.
	public abstract int calculateInterest(int principle , int rate , int time);
	
	// We can write default , static ,private method as usual.
	
	public default int result(int principle , int rate , int time)
	{
		return (principle * rate * time)/100;
	}

}
