package com.tnsif.daysixteen.QueueObjects;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExQueue1 {

	public static void main(String[] args) {
		
		Queue<Integer> r = new LinkedList<Integer>();
		
		r.add(10);
		r.add(6);
		r.add(20);
		r.add(8);
		r.add(2);
		
		System.out.println(r);
		
	//	r.clear();
		
    	int positionpeek = r.peek();
		System.out.println("Using peek method first value from queue: "+ r.peek());
		System.out.println(r);
		
		int positionelements = r.element();
		System.out.println("Using element method first value from queue: "+ positionelements);
		System.out.println(r);
		
		//int positionpoll = r.poll();
		System.out.println("Using poll method first value from queue: "+ r.poll());
		System.out.println(r);
		
		System.out.println(r.remove());
		System.out.println(r);
		
		// Traverse through queue
		
		Iterator itr = r.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
