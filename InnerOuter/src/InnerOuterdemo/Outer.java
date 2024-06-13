package InnerOuterdemo;

public class Outer {
	
	private int i=100;
	public void show() {
		System.out.println("In Outer class");
	}
	class Inner{
		private int j=200;
		public void test() {
			System.out.println("inner data : "+i);
			System.out.println("outer data : "+j);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o=new Outer();
		o.show();
		Outer.Inner oi=o.new Inner();
		oi.test();
		/*
		 Outer.Inner in=new Outer().new Innner();
		*/
	}

}
