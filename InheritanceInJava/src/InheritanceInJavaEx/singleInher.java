package InheritanceInJavaEx;


/*
class Employees{
	int basicsal;
	int hra;
	int da;
	public Employees() {
		basicsal=20000;
		hra=2000;
		da=5000;
	}
	public Employees(int bs,int hr, int da) {
		this.basicsal=bs;
		this.hra=hr;
		this.da=da;
	}
	public double calculateSalary() {
		return basicsal + hra + da;
	}
}
class Manager extends Employees{
	public double calculateIncentives() {
		return incentive;
	}
}*/

public class singleInher {
	
	public double basicsal,hra,da;
	public singleInher(double basicsal,double hra,double da) {
		this.basicsal=basicsal;
		this.hra=hra;
		this.da=da;
	}
	public double calculateSalary() {
		return basicsal + hra + da;
	}
	public static void main(String[] args) {
		Manager m=new Manager(2000,2345,3343,45343);
		System.out.println("salary"+m.calculateSalary());
		System.out.println("salary"+m.calculateInsentive());
	}
	
}

class Manager extends singleInher{
	private double incentive;
	public Manager(double basicsal,double hra,double da,double incentive) {
		super(basicsal,hra,da);
		this.incentive=incentive;
	}
	public double calculateInsentive() {
		return incentive;
	}
	
}


