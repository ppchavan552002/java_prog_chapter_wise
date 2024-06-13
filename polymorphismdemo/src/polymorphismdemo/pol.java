package polymorphismdemo;

class Animal{
	void eat() {
		System.out.println("eating......");
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("eating rat .......");
	}
}
class Lion extends Animal{
	void eat() {
		System.out.println("eating meat......");
	}
}

public class pol {
	public int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.eat();
		Dog d=new Dog();
		d.eat();
		Lion l=new Lion();
		l.eat();
	}

}
