package InheritanceInJavaEx;

class Animal12 {
	
	void eat() {
		System.out.println("Animal is Eating");
	}
}
class Dog1 extends Animal12{
	void bark() {
		System.out.println("Dog is Barking");
	}
}

class labrador extends Dog1{
	void color(){
		System.out.println("color is black");
	}
}

//form .java file
class labrador1 extends Dog{
	void color(){
		System.out.println("color is black");
	}
}


public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		labrador l=new labrador();
		l.color();
		l.bark();
		l.eat();
		//form anthor java file
		labrador1 l1=new labrador1();
		System.out.println("\nform animal.java file value get");
		l1.color();
		l1.bark();
		l1.eat();
	}

}
