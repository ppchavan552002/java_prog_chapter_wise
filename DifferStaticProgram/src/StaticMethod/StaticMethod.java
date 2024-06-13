package StaticMethod;

class Student{
	int rollno;
	String name;
	static String collage="RIT";
	//static method to change the value of staic variable
	static void change() {
		collage="COP";
	}
	Student(int r, String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+ " " +name + " "+ collage);
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		Student.change();
		Student s1=new Student(111,"ppc");
		Student s2=new Student(123,"aj");
		s1.display();
		s2.display();
	}
}
