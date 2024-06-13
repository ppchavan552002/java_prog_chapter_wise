package StringProgDemo;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2="World";
		String s3="World";
		System.out.println(s1.concat(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s2));
		
		System.out.println(s3.replace('r', 'R'));
		
		System.out.println(s1.contains("Hel"));
		System.out.println(s2.contains("e"));
		System.out.println(s3.contains("Hi"));
		
		System.out.println(s3.compareTo(s1));
		System.out.println(s1.compareTo(s3));
		
		System.out.println();
		
		System.out.println(s3.charAt(0));
		System.out.println(s3.length());
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		System.out.println();
		
		System.out.println(s1.substring(2));
		System.out.println(s2.substring(2,4));
	}

}
