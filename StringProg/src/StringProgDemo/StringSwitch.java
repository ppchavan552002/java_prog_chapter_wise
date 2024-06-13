package StringProgDemo;

import java.util.*;

public class StringSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Color");
		String color=sc.nextLine();
		switch(color.toLowerCase()) {
			case "red":
				System.out.println("Color is Red");
				break;
			case "green":
				System.out.println("color is Green");
				break;
			default:
				System.out.println("color Not Found");
		}
	}

}
