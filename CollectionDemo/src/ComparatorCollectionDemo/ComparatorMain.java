package ComparatorCollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> s=new ArrayList<>();
		s.add(new Student("Prathamesh", 21));
		s.add(new Student("Avdhut", 20));
		s.add(new Student("Ajinkya", 14));
		s.add(new Student("mangesh", 23));
		
		Collections.sort(s,new AgeComparator());
		for(Student a:s) {
			System.out.println(a);
		}
	}

}
