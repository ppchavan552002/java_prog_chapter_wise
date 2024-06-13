package ExceptionHendlingDemoExp;

public class ThrowsExp {
	
	static void doMath() {
		int divisor=0;
		if(divisor==0) {
			throw new ArithmeticException("Divisor enterd should not zero");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			doMath();
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
