package IterationCollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class iterationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ct=new ArrayList<>();
		ct.add("mango");
		ct.add("bannan");
		
		Iterator<String> it=ct.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
