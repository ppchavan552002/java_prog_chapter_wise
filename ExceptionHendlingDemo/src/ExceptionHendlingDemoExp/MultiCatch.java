package ExceptionHendlingDemoExp;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;

public class MultiCatch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiCatch m=new MultiCatch();
		try {
			throwException();
			
		}
		catch(IOException | ParseException | ClassNotFoundException  ex) 
		{
			System.out.println(ex);
		}

	}
	public static void throwException() throws IOException,ParseException,ClassNotFoundException{
		Double ran=Math.random();
		if(ran<0.33) {
			throw new IOException("IO Exception Occured"+ran);
		}else if(ran>0.66) {
			throw new ParseException("Parse Exception Occured", 34);
		}else {
			throw new ClassNotFoundException("Class Not Found Exception Occured");
		}
	}

}
