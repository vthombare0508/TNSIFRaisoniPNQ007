package com.tnsif.daythirteen;

public class MyChildThread extends Thread {
	
	@Override
	public void run()
	{
		System.out.println("Inside run() Thread is alive or not? "+ this.isAlive());
		
		int no = 0;
		while(no<4)
		{
			no++;
			System.out.println("number = "+ no);  
		}
	}

}
