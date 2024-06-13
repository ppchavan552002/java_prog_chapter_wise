package setCollectionDemo;

import java.util.*;

public class HashSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(40);
		hs.add(50);
		hs.add(70);
		System.out.println(hs.contains("40"));
		hs.remove(10);
		System.out.println(hs);
		System.out.println(hs.size());
		if(hs.isEmpty()) {
			System.out.println("List is Empty");
		}else {
			System.out.println("list not empty");
		}
		
	}

}
