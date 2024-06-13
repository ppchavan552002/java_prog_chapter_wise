package StaticProgExp;


class Student{
	int rollno;
	String name;
	static String collage="RIT";
	Student(int r, String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+ " " +name + " "+ collage);
	}
}


public class StaticProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(111,"ppc");
		Student s2=new Student(123,"aj");
		s1.display();
		s2.display();
	}

}
