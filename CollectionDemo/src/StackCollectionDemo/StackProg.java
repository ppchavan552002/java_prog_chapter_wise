package StackCollectionDemo;

import java.util.*;

public class StackProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		s.push(20);
		s.push(30);
		s.push(50);
		s.push(60);
		s.push(40);
		s.push(340);
		s.push(1320);
		
		System.out.println("top of Stacj : "+s.peek());
		
		System.out.println("Element Remove : "+s.pop());
		
		s.add(4, 333);
	
		System.out.println(s);
		
	}

}
