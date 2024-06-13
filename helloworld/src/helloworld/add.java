package helloworld;

import java.util.*;

public class add {
	
	public void Addition(int a, int b){
		int s=a+b;
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b,c;
		char ch;
		
		System.out.println("size of : " +Character.BYTES);
		add ad=new add();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Two value");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		ad.Addition(45,23);
		System.out.println("entered value addition : " + c);
		
	}

}
