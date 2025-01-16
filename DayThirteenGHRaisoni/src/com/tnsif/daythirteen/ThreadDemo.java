package com.tnsif.daythirteen;

public class ThreadDemo {

	public static void main(String[] args) {
		
		ChildThread t1 = new ChildThread(5, "First");  // new state
		ChildThread t2 = new ChildThread(4, "Second");
		ChildThread t3 = new ChildThread(3, "Third");
		
		//t3.start();
		t1.start();      // runnable
		t2.start();
		
		
		
		
		
		//t2.run();  // single threaded application
		
		
		System.out.println("------- End of Main method--------");
	}

}
