package com.tnsif.daysixteen.QueueObjects;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> pq = new PriorityQueue<Integer>();
		
	    pq.add(10);
		pq.add(6);
		pq.add(20);
		pq.add(8);
		pq.add(2);
		pq.add(1);
		System.out.println(pq);

	}

}
