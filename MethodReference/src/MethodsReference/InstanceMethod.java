package MethodsReference;

import java.util.ArrayList;
import java.util.Collections;

class Person1{
	int age;
	String name;
	Person1(int age,String name){
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return age+" "+name;
	}
}

class PersonComparator1 {
	public  int ComparaName(Person1 a,Person1 b) {
		return a.getName().compareTo(b.getName());
		}
}


public class InstanceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person1> arr=new ArrayList<Person1>();
		
		arr.add(new Person1(23,"Neelem"));
		arr.add(new Person1(27,"Pritam"));
		arr.add(new Person1(25,"Mangesh"));
		arr.add(new Person1(29,"Avdhut"));
		

		PersonComparator1 obj=new PersonComparator1();
		
		//Collections.sort(arr, obj::ComparaName);
		
		Collections.sort(arr, (a,b)->obj.ComparaName(a,b));
		
		for(Person1 p:arr) {
			System.out.println(p);
		}
	}
	
	


}
