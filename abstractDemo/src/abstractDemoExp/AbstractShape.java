package abstractDemoExp;

abstract class MyShape{
	public abstract void area(); 
}
class Circle extends MyShape{
	private int radius;
	public Circle(int r) {
		this.radius=r;
	}
	public void area() {
		double area=3.14*radius*radius;
		System.out.println("Area of Circle : "+area);
	}
}
class Rectangle extends MyShape{
	private int len,bred;
	public Rectangle(int l,int b) {
		this.len=l;
		this.bred=b;
	}
	public void area() {
		System.out.println("Area of Rectangle : "+len * bred);
	}
}

public class AbstractShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cir =new Circle(5);
		cir.area();
		Rectangle rect=new Rectangle(3,5);
		rect.area();
	}

}
