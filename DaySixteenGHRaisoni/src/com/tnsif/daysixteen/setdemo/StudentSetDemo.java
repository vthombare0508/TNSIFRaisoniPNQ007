package com.tnsif.daysixteen.setdemo;

import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {

	public static void main(String[] args) {
		
		

		Set<Students> std = new HashSet<Students>();
		
		std.add(new Students(101, "Sahil", 90));
		std.add(new Students(102, "Komal", 78));
		std.add(new Students(103, "Asha", 89));
		std.add(new Students(104, "Pratiksha", 96));
		
		System.out.println(std);
		
	}

}
