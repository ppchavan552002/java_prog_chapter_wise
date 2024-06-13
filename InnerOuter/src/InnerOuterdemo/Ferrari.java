package InnerOuterdemo;

public class Ferrari {
	public void drive() {
		System.out.println("ferrari");
	}
	public static void main(String[] args) {
		Car1 c=new Car1();
		c.show();
	}

}
class Car1{
	Ferrari p=new Ferrari() {
		public void drive() {
			System.out.println("Anonymous class");
		}
	};
	public void show() {
		p.drive();
	}
	
}
