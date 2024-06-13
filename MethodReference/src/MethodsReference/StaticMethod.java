package MethodsReference;

import java.util.ArrayList;
import java.util.Collections;

class Person{
	int age;
	String name;
	Person(int age,String name){
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

class PersonComparator {
	public static int ComparaAge(Person a,Person b) {
		return a.getAge()-b.getAge();
		}
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> arr=new ArrayList<Person>();
		arr.add(new Person(23,"Neelem"));
		arr.add(new Person(27,"Pritam"));
		arr.add(new Person(25,"Mangesh"));
		arr.add(new Person(29,"Avdhut"));
		
		//Collections.sort((arr), PersonComparator::ComparaAge);
		
		Collections.sort(arr, (a, b) -> PersonComparator.ComparaAge(a, b));
		
		for(Person p:arr) {
			System.out.println(p);
		}
	}

}