//program to demonstrate creating a child Thread class- extending the Thread class 
package com.tnsif.daythirteen;

public class ChildThread  extends Thread{

	private int n;
	private String msg;
	
	public ChildThread(int n, String msg) {
	
		this.n = n;
		this.msg = msg;
	}
	
	@Override
	public void run()
	{
		for(int i=1; i<=n; i++)
		{
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Message "+ msg +" "+ i);
			
			//System.out.println(msg + " "+ i + " "+ Thread.currentThread().getName());
		}
		
		
	}
	
	
	
	
	
	
}
