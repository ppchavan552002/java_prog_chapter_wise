package setCollectionDemo;

import java.util.*;

public class CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> li=new LinkedHashSet<>();
		li.add("mango");
		li.add("bannan");
		li.add("apple");
		li.add("orange");
		li.add("graphes");
		li.add("graphes");
		li.add("graphes");
		li.add("graphes");
		li.add("graphes");
		System.out.println(li);		//duplicate value is remove
		
	}

}
