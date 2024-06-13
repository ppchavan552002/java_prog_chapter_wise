package ThreadDemoExp;

class SimpleThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		System.out.println("Done !");
	}
}

public class CreateThread extends Thread  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			for(int i=0;i<5;i++) { 
//				  Thread.sleep(1000);
//				  System.out.println(i+" "+Thread.currentThread().getName());
//				  System.out.println("Done !"); //just for the fun
//			  }
//			
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		  
//		SimpleThread s=new SimpleThread();
//		s.start();															//madam code
		
		Thread t1=new SimpleThread();
		Thread t2=new SimpleThread();
		
		t1.setName("one");
		t2.setName("two");
		
		
		try {
			t1.start();
			t2.start();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
