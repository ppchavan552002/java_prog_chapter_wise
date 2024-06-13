package ExceptionHendlingDemoExp;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data=25/5;
			System.out.println(data);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally Block always execute");
//			System.exit(0);
		}
		System.out.println("finally Block always execute");
	}

}
