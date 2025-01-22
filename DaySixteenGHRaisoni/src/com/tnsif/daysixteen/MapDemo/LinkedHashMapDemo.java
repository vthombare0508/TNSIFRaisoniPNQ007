package com.tnsif.daysixteen.MapDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap ht = new LinkedHashMap();
		
		ht.put(101, 100000);
		ht.put(102, "Vikas");
		ht.put(103, 23.89);
		ht.put("IT", "Sahil");
		
		System.out.println(ht);

	}

}
