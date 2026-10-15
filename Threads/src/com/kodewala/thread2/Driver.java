package com.kodewala.thread2;

class EmailSender extends Thread{
	@Override
	public void run()
	{
		// When thread is in RUNNING state -->
		// Thread is doing work or task -->
		// then from RUNNING to WAITING state -->
		// once waiting is over Thread will move to RUNNABLE state not RUNNING --> 
		// Once CPU allows , thread moves to Running state --> 
		// Once run method is completed , thread will be in TERMINATED(Dead) state and we can not restart it again,
		// otherwise it will throw IllegalThreadState Exception.
		System.out.println("Sending Email"+Thread.currentThread().getName());
	}
	
}
// Thread life cycle : NEW -> RUNNABLE -> RUNNING -> WAITING/BLOCKED -> RUNNABLE -> RUNNING -> TERMINATED
public class Driver {
	
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		// Once thread object is created , state = NEW
		EmailSender t1 = new EmailSender();
		// once we call thread.start() , state = RUNNABLE
		t1.start();
		
		// once CPU gives time to run/execute the thread , state = RUNNING, and it will go to execute the 'run' method.
	}

}
