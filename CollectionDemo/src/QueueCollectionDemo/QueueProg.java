package QueueCollectionDemo;

import java.util.*;

public class QueueProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Object> numQ=new PriorityQueue<>();
		numQ.offer(45);
		numQ.add(5);
		numQ.add(20);
		numQ.add(30);
		numQ.add(74);
		
		//Check front of queue
		System.out.println("Head of Queue : "+numQ.peek());
	
		//remove element from queue
		System.out.println("Element of Queue : "+numQ.poll());
		
		System.out.println(numQ);
		
	}

}
