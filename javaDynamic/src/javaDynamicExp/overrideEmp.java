package javaDynamicExp;

class Employees{
	
	public Employees getEmployees() {
		return new Employees();
	}
}
class Manager12 extends Employees{
	public Manager12 getEmployees() {					//manager value
		return new Manager12();
	}
}

public class overrideEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager12 m=new Manager12();
		Employees t=m.getEmployees();
		Employees e=new Employees();
		System.out.println(e.getClass().getSimpleName());
		System.out.println(t.getClass().getSimpleName());
	}

}
