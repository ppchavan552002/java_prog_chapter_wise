package FileIOJavaDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin=null;
		try {
			fin=new FileInputStream("C:\\Users\\Victory\\OneDrive\\Desktop\\java_prog_chapter_wise\\FileIOJava\\src\\FileIOJavaDemo\\Info.txt");
			int data=0;
			String s="";
			while((data=fin.read())!=-1)
				s=s+(char)data;
			System.out.println(s);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			fin.close();
		}
	}

}