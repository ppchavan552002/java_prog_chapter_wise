package FinalUsesExp;

public class FinalMethod {
	final void run() {
		System.out.println("hello");
	}
	class Car extends FinalMethod{
		void run() {
			System.out.println("hi");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalMethod f=new FinalMethod();
		f.run();
	}

}
