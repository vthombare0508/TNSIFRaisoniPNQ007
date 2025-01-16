package com.tnsif.daythirteen;

public class ThreadLifeCycle {

	public static void main(String[] args) {
		
		MyChildThread myThread = new MyChildThread();  // new state
		System.out.println("Before Runnable stage Thread is alive or not?"+myThread.isAlive());
		myThread.start();  // Runnable State
		
		System.out.println("In Running stage Thread is alive or not?"+myThread.isAlive());
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Thread is interupped");
		}
		
		System.out.println("After complete execution Thread is alive or not?"+myThread.isAlive());
		
		
		
		
		
		

	}

}
