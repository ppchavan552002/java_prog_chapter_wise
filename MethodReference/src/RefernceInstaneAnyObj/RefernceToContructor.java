package RefernceInstaneAnyObj;

interface PersonFactory{
	Person get(int age,String name);
}

class Person{
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	Person(){
		age=0;
		name="default";
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
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
}

public class RefernceToContructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonFactory p=Person::new;
		System.out.println("Constructor isn't call yet");
		System.out.println(p.get(23, "prathamesh"));
	}

}
