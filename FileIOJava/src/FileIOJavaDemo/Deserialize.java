package FileIOJavaDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Deserial.java
		  FileInputStream fis = null;
	        ObjectInputStream ois = null;
	        try {
	            Employee ob = null;
	            fis = new FileInputStream("C:\\Users\\Victory\\OneDrive\\Desktop\\java_prog_chapter_wise\\FileIOJava\\src\\FileIOJavaDemo\\Serial.txt");
	            ois = new ObjectInputStream(fis);
	            ob = (Employee) ois.readObject();
	            System.out.println(ob);
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            ois.close();
	        }
	}

}
