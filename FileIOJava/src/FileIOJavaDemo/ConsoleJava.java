package FileIOJavaDemo;

import java.io.Console;

public class ConsoleJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c=System.console();
		if (c != null) {
            System.out.println("Enter your name:");
            String n = c.readLine();
            System.out.println("Welcome " + n);
        } else {
            System.out.println("No console available. Please run this program from a console.");
        }
		}

}
/*
	C:\Users\Victory>cd C:\Users\Victory\OneDrive\Desktop\java_prog_chapter_wise\FileIOJava\src

	C:\Users\Victory\OneDrive\Desktop\java_prog_chapter_wise\FileIOJava\src>javac FileIOJavaDemo\ConsoleJava.java
	
	C:\Users\Victory\OneDrive\Desktop\java_prog_chapter_wise\FileIOJava\src>java FileIOJavaDemo.ConsoleJava
	Enter your name:
	prathaemsh
	Welcome prathaemsh
 */