package constructorDemoExample;

public class methodOverLoad {

	
	public void add(int x, float y) {
		System.out.println("addition is  : "+(x+y));
	}
	
	public float add1(int xa, float y) {
		return xa+y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverLoad m=new methodOverLoad();
		m.add(4, 2.2f);
		float sum=m.add1(4, 2.2f);
		System.out.println("addition with return type : "+sum);
	}
}
