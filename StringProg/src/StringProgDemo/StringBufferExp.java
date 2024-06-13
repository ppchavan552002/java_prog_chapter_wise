package StringProgDemo;

public class StringBufferExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a=new StringBuffer("Hello");
		a.append(" java");							//concate the string
		System.out.println(a);
		a.insert(0,"game ");
		System.out.println(a);
		System.out.println(a.reverse());
		
		System.out.println();
		a.reverse();
		System.out.println(a.delete(0, 5));
		System.out.println(a.deleteCharAt(5));
		
	}

}
