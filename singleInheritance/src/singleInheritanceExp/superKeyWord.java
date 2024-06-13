package singleInheritanceExp;


class Animal{
	String color="white";
}

class Dog extends Animal{
	String color="Black";
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
class cat extends Dog{
	String color="green";
	void printColour() {
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class superKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		cat c=new cat();
		c.printColour();
		d.printColor();
	}

}
