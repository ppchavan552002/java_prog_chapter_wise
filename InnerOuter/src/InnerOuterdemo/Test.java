package InnerOuterdemo;

@FunctionalInterface
interface InterDemo{
	public void m1();
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterDemo iref=()->System.out.println("Hello World");
		
		
		iref.m1();
	}

}
