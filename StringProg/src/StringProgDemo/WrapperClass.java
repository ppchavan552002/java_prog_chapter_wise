package StringProgDemo;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=30;
		Integer i=new Integer(x);
		
		Integer obj=new Integer(100);
		int y=obj.intValue();
		
		String s="30";
		int j=Integer.parseInt(s);
		
		String s1="30.6667";
		Double k=Double.valueOf(s1);
		
		System.out.println(i);
		System.out.println(y);
		System.out.println(j);
		System.out.println(k);
		}

}
