package setCollectionDemo;

import java.util.HashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("Prathamesh", 1);
		hm.put("Ajinkya", 2);
		hm.put("Iliyas", 3);
		System.out.println(hm);
		System.out.println(hm.get("Iliyas"));
		hm.remove("Iliyas");
		System.out.println(hm.containsKey("Ajinkya"));
		System.out.println(hm.size());
		System.out.println(hm);
	}

}
