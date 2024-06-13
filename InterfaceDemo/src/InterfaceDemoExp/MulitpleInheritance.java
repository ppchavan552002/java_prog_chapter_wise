package InterfaceDemoExp;
interface InterfaceDemo1{
	default void m1() {
		System.out.println("InterDemo1-M1-Method....");
	}
}
interface InterfaceDemo2{
	default void m1() {
		System.out.println("InterDemo2-M1-Method");
	}
}	

public class MulitpleInheritance implements  InterfaceDemo1,InterfaceDemo2{

	public void m1() {
		System.out.println("Test class M1-Method");
		InterfaceDemo1.super.m1();
		InterfaceDemo2.super.m1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MulitpleInheritance t=new  MulitpleInheritance();
		 t.m1();
	}

}
