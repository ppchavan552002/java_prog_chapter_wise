package setCollectionDemo;

import java.util.TreeSet;

public class TreeSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add(40);
		ts.add(50);
		ts.add(10);
		
		System.out.println("size of list "+ts.size());
		System.out.println(ts);
		
		ts.remove(10);
		System.out.println("List Atfer remove "+ts);
		
	}

}
