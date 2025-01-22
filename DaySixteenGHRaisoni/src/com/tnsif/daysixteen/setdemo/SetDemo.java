package com.tnsif.daysixteen.setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<Integer>();
		
		set1.add(100);
		set1.add(20);
		set1.add(10);
		set1.add(40);
		set1.add(35);
		set1.add(20);
		set1.add(40);
		
		System.out.println(set1);
		
		System.out.println(set1.contains(20));
		
		System.out.println(set1.isEmpty());
		
		set1.remove(20);
		System.out.println(set1);
		
		Iterator<Integer> i = set1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
