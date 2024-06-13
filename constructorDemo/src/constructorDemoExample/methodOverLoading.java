package constructorDemoExample;

public class methodOverLoading {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c ) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverLoading ov=new methodOverLoading();
		int sum2=ov.add(34, 23);
		int sum3=ov.add(45,34,67);
		System.out.println("Two number addition :" +sum2);
		System.out.println("Three number addition :" +sum3);

	}

}
