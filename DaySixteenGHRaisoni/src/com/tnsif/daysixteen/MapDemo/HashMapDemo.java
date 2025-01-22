package com.tnsif.daysixteen.MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> ht = new HashMap<Integer, String>();
		
		ht.put(101, "Mumbai");
		ht.put(102, "Pune");
		ht.put(103, "Karjat");
		ht.put(104, "Satara");
		ht.put(105, "Pune");
		ht.put(103, "New Mumbai");
		
		System.out.println(ht);
		
		Set s= ht.keySet();
		System.out.println(s);
		
		
		Collection<String> c = ht.values();
		System.out.println(c);
		
		ht.replace(101, "Delhi");
		System.out.println(ht);
		
		
	

	}

}


