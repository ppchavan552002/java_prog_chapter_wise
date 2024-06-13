package InnerOuterdemo;

public interface Drivable {
	public void drive(); 
//	public static void main(String[] args) {
//		Car12 c=new Car12();
//		c.show();
//	}
	

}

class Car12{
	Drivable d=new Drivable() {
		public void drive() {
			System.out.println("Anonymous class");
		}
	};
	public void show() {
		d.drive();
	}
	public static void main(String[] args) {
		Car12 c=new Car12();
		c.show();
	}
}