package InterfaceDemoExp;

interface Interface{
	final float PI=3.14f;
	default void display() {
		System.out.println("Default Method Implemention...");
	}
}

public class InterfaceDemo3 implements Interface {
	public static void main(String[] args) {
		InterfaceDemo3 t=new InterfaceDemo3();
		t.display();
	}
}
