package ListCollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=new ArrayList<>();
		li.add("Mango");
		li.add("bannan");
		li.add("apple");
		System.out.println(li.get(1));
		li.add(1, "graphes");				//add the value in specific position and push the element
		System.out.println(li);
		li.set(1, "watermellon");			// replace the value of the position
		System.out.println(li);
		for(String i:li) {
			System.out.println(i);
		}
		li.remove(1);						//remove specific element
		System.out.println(li);
		li.clear();							//remove the all element in list
		System.out.println(li);
		
	}

}
