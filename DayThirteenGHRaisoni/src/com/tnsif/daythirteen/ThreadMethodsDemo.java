package com.tnsif.daythirteen;

public class ThreadMethodsDemo {

	public static void main(String[] args) {
		
		ChildThread t1 = new ChildThread(5,"First"); // creating child thread object
		ChildThread t2 = new ChildThread(10,"Second"); // creating child thread object
		
		System.out.println("Current Thread "+Thread.currentThread());
		
		t1.start();
		t2.start();
		
		System.out.println("First Thread : " +t1.getName());
		System.out.println("Second Thread : "+t2.getName());
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		
		System.out.println("First Thread : " +t1.getName());
		System.out.println("Second Thread : "+t2.getName());
		
		System.out.println("Current Thread : "+ Thread.currentThread().getName());
		
		System.out.println("Priority of t1 : "+t1.getPriority());
		
		t1.setPriority(10);
		t2.setPriority(3);
		
		System.out.println("Priority of t1 : "+t1.getPriority());
		System.out.println();
		
//		try {
//			t1.join();  // wait current thread until t1 is dead
//			
//		} catch (InterruptedException e) {
//			
//			System.err.println("Thread Interrupted : "+ e.getMessage());
//		}
		System.out.println("------ End of Main-------");
	}

}











