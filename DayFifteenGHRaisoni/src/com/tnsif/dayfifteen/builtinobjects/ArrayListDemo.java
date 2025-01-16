package com.tnsif.dayfifteen.builtinobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List list1 =new ArrayList(); // creates empty raw ArrayList (allows heterogenous elements)
		
       System.out.println("Size : "+ list1.size());
       System.out.println("Is list empty? "+ list1.isEmpty());
       
       list1.add(10);
       list1.add(20);
       list1.add(true);
       list1.add(false);
       list1.add(20);
       list1.add("Hello");
       list1.add(34.78);
       list1.add(20);
       list1.add('S');
       list1.add(5, "Hi");
       list1.add(20);
       
       System.out.println("List is "+ list1);
       
       System.out.println("Is list contains 15? "+ list1.contains(15));
       
       System.out.println("Size : "+ list1.size());
       
       System.out.println(list1.remove(2));
       System.out.println(list1);
       
       System.out.println("Element at 5 location is : "+ list1.get(3));
       
       System.out.println("Element removed : "+  list1.remove(list1.lastIndexOf(20))); // remove 20 last occurrence
       
       System.out.println("Element Removed : "+ list1.remove(list1.indexOf(20)));
       System.out.println(list1);
       
   //   Collections.sort(list1);
   //   System.out.println(list1);
		
       
       list1.clear();
       System.out.println("List is "+ list1);
       
       
       // Using Generic we can create Homogeneous List
       List<String> names = new ArrayList<String>();
       
       names.add("Amit");
       names.add("Shreya");
       names.add("Rohit");
       names.add("Priya");
       names.add("Pooja");
     //  names.add(20);  // Generic are type safety
       
       System.out.println(names);
       Collections.reverse(names);
       System.out.println("Reverse Name List is : "+names);
       
       System.out.println("\'Shreya\' contains in name list? "+ names.contains("Shreya"));
       
       System.out.println("Name List Before Sorting is "+ names);
       Collections.sort(names);
       System.out.println("Sorting in Alphabetical order "+names);
       
       
       // Traversing a List
       
       System.out.println("--------------------Traversing a list--------------------");
       
       Iterator<String> i = names.iterator();
       
       while(i.hasNext())
       {
    	   String nm = i.next();
    	   System.out.println(nm);
       }
       
       System.out.println("-----------------------Traversing a list in backward manner------------------");
       
       ListIterator<String> li= names.listIterator(names.size());
       while(li.hasPrevious())
       {
    	   String nm = li.previous();
    	   System.out.println(nm);
       }
	}

}
