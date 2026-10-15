package com.kodewala.thread3;

class Print{
	
	public synchronized void printNumber()
	{
		for(int i=0 ; i<10 ; i++)
		{
			System.out.println("Printing " +i+"  ["+Thread.currentThread().getName()+"]");
		}
	}

}

class PrintThread extends Thread{
	
	Print print;
	
	PrintThread(Print _print)
	{
		this.print = _print;
	}
	
	@Override
	public void run()
	{
		print.printNumber();
	}
}



public class Driver3 {
	
	public static void main(String[] args)
	{
		Print print = new Print();
		
		PrintThread t1 = new PrintThread(print);
		t1.setName("FirstThread");
		t1.start();
		
		PrintThread t2 = new PrintThread(print);
		t2.setName("2ndThread");
		t2.start();
	}

}
