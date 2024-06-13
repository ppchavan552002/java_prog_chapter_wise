package hierarchicalInheritance.exp;


class Bird{
	void eat() {
		System.out.println("The animal is eating");
	}
}
class Parrot extends Bird{
	void fly() {
		System.out.println("Bird is flying");
	}
}
class Sparrow extends Bird{
	void drink(){
		System.out.println("bird are drinking water");
	}
}

public class HirachiInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parrot p=new Parrot();
		Sparrow s=new Sparrow();
		p.eat();
		p.fly();
		s.drink();
		s.eat();
	}

}
