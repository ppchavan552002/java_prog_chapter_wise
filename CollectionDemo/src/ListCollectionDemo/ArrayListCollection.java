package ListCollectionDemo;

import java.util.*;

public class ArrayListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=new ArrayList<>();
		li.add("Mango");
		li.add("bannan");
		li.add("apple");
		System.out.println(li);
		System.out.println(li.get(0));        //specific value
	
		
		//search elememts
		for(int i=0;i<li.size();i++) {
			if(li.get(i)=="bannan") {
				System.out.println("value is found :"+li.get(i));
			}
		}
		
		//iteraation
		System.out.println();
		Iterator<String> i=li.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		for(String fruit:li) {
			System.out.println(fruit);
		}
	}

}
