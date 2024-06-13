package LinkedListCollectionDemo;

import java.util.*;

public class LinkedListProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li=new LinkedList<>();
		li.add("mango");
		li.add("bannan");
		li.add("apple");
		li.add("orange");
		li.add("graphes");
		for(String i:li) {
			System.out.println(i);
		}
		System.out.println();
		Collections.sort(li);
		for(String i:li) {
			System.out.println(i);
		}
	}

}
