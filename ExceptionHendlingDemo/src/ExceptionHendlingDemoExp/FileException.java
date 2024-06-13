package ExceptionHendlingDemoExp;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.*;

public class FileException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fs=new FileInputStream("stud.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("error-file not found");
		}
	}

}
