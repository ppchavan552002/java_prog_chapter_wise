package InterfaceDemoExp;

interface InterfacePrg1 {
	void print();
}
class A6 implements InterfacePrg1{
	public void print() {
		System.out.println("hello World");
	}
}
public class InterfacePrg{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6 a= new A6();
		a.print();
	}

}
