package com.kodewala.real.example.thread4;

public class TransferThread1 extends Thread {
	
	private BankAccount sender;
	private BankAccount reciever;
	
	public TransferThread1(BankAccount sender , BankAccount reciever)
	{
		this.sender = sender;
		this.reciever = reciever;
	}
	
	public void run() {
		sender.transfer(reciever, 800);
	}

}
