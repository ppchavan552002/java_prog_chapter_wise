package constructorDemoExample;

public class constructorProgram {
	
	String brand;
	int year;
	
	//contructor
//	public constructorProgram(String brand, int year ) {
//		this.brand=brand;
//		this.year=year;
//	}
	
	public void add(String brand,int year) {
		this.brand=brand;
		this.year=year;
	}

	//wee have  to display ca details
	public void Display() {
		System.out.println("Brand : "+brand);
		System.out.println("Year : "+year);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorProgram a=new constructorProgram();
		a.add("BMW",2013);
		a.Display();
		a.add("RR", 2024);
		a.Display();
		
	}

}
