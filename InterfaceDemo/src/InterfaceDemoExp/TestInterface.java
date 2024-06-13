package InterfaceDemoExp;

interface Drawable{
	void draw();
}
class Rectangle implements Drawable{
	public void draw() {
		System.out.println("Drawing rectangle");
	}
}
class Circle implements Drawable{
	public void draw() {
		System.out.println("Drawing Circle");
	}
}

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		r.draw();
		c.draw();
	}

}
