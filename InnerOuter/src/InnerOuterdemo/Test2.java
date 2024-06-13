package InnerOuterdemo;

@FunctionalInterface
interface InterDemo2{
	public int square(int n);
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterDemo2 sq=(n)->n*n;
		System.out.println(sq.square(3));
		
	}

}