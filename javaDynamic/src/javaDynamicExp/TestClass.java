package javaDynamicExp;

class Parent{
	Parent(){
		System.out.println("parent class");
	}
}

class Child extends Parent{
	Child(){
		super();
		System.out.println("child class");
	}
}


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Child();
		if(p instanceof Child) {
			System.out.println("true");
		}
	}

}
