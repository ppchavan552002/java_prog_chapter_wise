package javaDynamicExp;

class Employee12{
	public void calculateSalary() {
		System.out.println("calculate base salary...");
	}
}

class Manager1 extends Employee12{
	public void calculateSalary() {
		System.out.println("calculate Manager salary");
	}
	public void calculateIncentive() {
		System.out.println("calculate Manager INncentive");
	}
}




public class DynamicTypeCastingExample {
	static void diplaySalary(Employee12 emp) { 
		emp.calculateSalary();
		((Manager1)emp).calculateIncentive();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager1 m=new Manager1();
		m.calculateIncentive();
		m.calculateSalary();
		System.out.println();
		diplaySalary(m);

	}

}
