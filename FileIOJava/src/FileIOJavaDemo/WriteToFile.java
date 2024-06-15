package FileIOJavaDemo;

import java.io.*;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=null;
//		FileInputStream fin=null;
		try {
//			fin=new FileInputStream("C:\\Users\\Victory\\OneDrive\\Desktop\\java_prog_chapter_wise\\FileIOJava\\src\\FileIOJavaDemo\\Info.txt");
//			int data=0;
//			String s1="";
//			while((data=fin.read())!=-1)
//				s1=s1+(char)data;
//			System.out.println(s1);
			fout=new FileOutputStream("C:\\Users\\Victory\\OneDrive\\Desktop\\java_prog_chapter_wise\\FileIOJava\\src\\FileIOJavaDemo\\Info.txt");
			String s="SEED Infotech Ltd\npune\nIndia";
//			for(int i=0;i<s1.length();i++) {
//				fout.write(s1.charAt(i));
//			}
//			fout.write('\n');
			for(int i=0;i<s.length();i++) {
				fout.write(s.charAt(i));
			}
				
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			fout.close();
		}
	}

}
/*
 * commited line is for write the text without overwrite the old text
 * they write text next to old text
 */
