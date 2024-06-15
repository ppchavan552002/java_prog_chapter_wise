package FileIOJavaDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	/**
	 * 
	 */
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double d) {
		super();
		this.id = id;
		this.name = name;
		this.salary = d;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	//Deserial.java
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]");
	}
	
}

public class ObjectSerialization{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//serial.java
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			Employee e=new Employee(1001,"Rohan",10000.00);
			fos=new FileOutputStream("C:\\Users\\Victory\\OneDrive\\Desktop\\java_prog_chapter_wise\\FileIOJava\\src\\FileIOJavaDemo\\Serial.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(e);
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			oos.close();
		}
		
		
		
	
	//Deserial.java
	FileInputStream fis=null;
	ObjectInputStream ois=null;
	try{
		Employee ob=null;
		fis=new FileInputStream ("C:\\\\Users\\\\Victory\\\\OneDrive\\\\Desktop\\\\java_prog_chapter_wise\\\\FileIOJava\\\\src\\\\FileIOJavaDemo\\\\Serial.txt");
		ois=new ObjectInputStream (fis);
		ob= (Employee) ois.readObject();
		System.out.println(ob);
		//ob.display();
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		ois.close();
	}
}
}
