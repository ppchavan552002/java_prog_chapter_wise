package InnerOuterdemo;

interface Number{
	public int addtion(int a, int b);
}

public class numberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number n=(int a,int b)->{
			return (a+b);
		};
		Number n1=(int a,int b)->(a+b);
		Number n2=(a,b)->a+b;
		
		int s=n.addtion(23, 45);
		int s1=n1.addtion(25, 41);
		int s2=n2.addtion(21, 49);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	}

}
