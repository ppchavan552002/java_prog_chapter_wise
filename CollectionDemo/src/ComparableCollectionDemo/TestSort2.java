package ComparableCollectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(101,"ram",23));
		al.add(new Student(102,"sham",25));
		al.add(new Student(123,"tom",45));
		al.add(new Student(132,"jerry",47));
		al.add(new Student(176,"jack",765));
		
		Collections.sort(al);
		for(Student a:al) {
			System.out.println(a.rollno+" "+a.name+" "+a.age);
		}
	}

}
