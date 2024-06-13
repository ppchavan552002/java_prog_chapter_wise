package InheritanceInJavaEx;

class MyDate{
	int day;
	int month;
	int year;
	public MyDate(){
		day=3;
		month=3;
		year=2024;
	}
	public MyDate(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String toString() {
		return day+"/"+month+"/"+year;
	}
	
}

class Employee{
	private int emp_id;
	private String name;
	private MyDate birthDate;
	//default constructor
	public Employee() {
		emp_id=1;
		name="Johm";
		birthDate=new MyDate();				//object
	}
	//parameterized constructor
	public Employee(int id, String nm, MyDate d) {
		emp_id=id;
		name=nm;
		birthDate=d;
	}
	public String toString() {
		return "Employee ID: " + emp_id + ", Name: " + name + ", Birth Date: " + birthDate;
	}
}

public class Employ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee(2,"Andy",new MyDate(1,2,2024));
		
		System.out.println(e1);
		System.out.println(e2);
	}

}
