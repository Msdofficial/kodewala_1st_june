package com.kodewala.thread6.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Task {
	
	ReentrantLock rel = new ReentrantLock();

	public /* synchronized */ void doSomething() {
		/**
		 *  Earlier we were using 'synchronize' keyword before a method or a block to allow 
		 *  only one thread to access a particular method for a shared object and the locking 
		 *  and unlocking was handled by JVM . To take control on locking and unlocking we can
		 *  use Reentrant lock where we lock and unlock manually which saves us form deadlock.
		 */
		
		rel.tryLock();
		for (int i = 0; i < 5; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "] and " + i);
		}
		rel.unlock();  

		/**
		 * Since Reentrant Lock is manual locking and unlocking , if we will forgot to 
		 * unlock , it will go to deadlock condition.
		 */
	}

}
