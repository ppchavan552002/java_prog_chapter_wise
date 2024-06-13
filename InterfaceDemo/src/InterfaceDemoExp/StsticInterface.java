package InterfaceDemoExp;

interface Interface2{
	final int a=10;
	static void print() {
		System.out.println("static Method");
	}
}


public class StsticInterface implements Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2.print();
		System.out.println(a);
	}

}
