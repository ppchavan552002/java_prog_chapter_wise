package InheritanceInJavaEx;

class Animal1 {
	
	void eat() {
		System.out.println("Animal is Eating");
	}
}
class Dog extends Animal1{
	void bark() {
		System.out.println("Dog is Barking");
	}
}

public class Animal{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}
