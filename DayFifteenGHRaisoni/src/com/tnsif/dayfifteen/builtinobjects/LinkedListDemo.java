package com.tnsif.dayfifteen.builtinobjects;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		// ll.add("Hello");
		
		System.out.println(ll);
		
		System.out.println(""+ ll.get(3));
		System.out.println("First Element is "+ ll.getFirst());
		System.out.println("First Element is "+ ll.getLast());
		
		ll.removeFirst();
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		
	}

}
