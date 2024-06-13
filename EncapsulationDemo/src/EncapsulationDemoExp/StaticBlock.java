package EncapsulationDemoExp;
public class StaticBlock{
	static int number;
	//static block
	static {
		number=42;
		System.out.println("static block executed.value of number: "+number);
	}
	public StaticBlock() {
			
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		StaticBlock a= new StaticBlock();
	}
}
