package com.tnsif.daysixteen.QueueObjects;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExDequeueDemo {

	public static void main(String[] args) {
	
		Deque<String> deque1 = new ArrayDeque<String>();
		
		deque1.add("Mango");
		deque1.add("Apple");
		deque1.add("Cherry");
		deque1.add("Grapes");
		deque1.add("Banana");
		deque1.addFirst("Orange");
		
		System.out.println(deque1);
		
		deque1.removeLast();
		System.out.println(deque1);
		
		
		System.out.println(deque1.pollFirst());
		System.out.println(deque1);
		
		deque1.pollLast();
		System.out.println(deque1);
		
		
		
	}

}
