package ExceptionHendlingDemoExp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionThrowsFile {
	static void readFile() throws FileNotFoundException{
		FileInputStream fi=new FileInputStream("stud.txt");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			readFile();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}

}
