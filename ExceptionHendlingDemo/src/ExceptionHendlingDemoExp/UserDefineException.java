package ExceptionHendlingDemoExp;

class ApplicationException extends Exception{
	public String message;
	public ApplicationException(String msg) {
		message = msg;
	}
	public String toString() {
		return message;
	}
}

class MyApp{
	public void myMethod(int ele) throws ApplicationException{
		if(ele<0) {
			throw new ApplicationException("Exception Occured");
		}
	}
}

public class UserDefineException {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyApp a=new MyApp();
		try {
			a.myMethod(-1);
		}
		catch(ApplicationException e) {
			e.getMessage();
			System.out.println(e);
		}
		
	}
}
