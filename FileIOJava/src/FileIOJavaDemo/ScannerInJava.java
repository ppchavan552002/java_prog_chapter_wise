package FileIOJavaDemo;

import java.util.Scanner;

public class ScannerInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Name");
		String name=sc.next();
		System.out.println("Enter a Roll No");
		int ro=sc.nextInt();
		System.out.println("Hello "+name+" !");
		System.out.println("Name :"+name+"\nRoll No :"+ro);
	}

}
