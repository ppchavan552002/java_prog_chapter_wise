package ThreadDemoExp;

class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		System.out.println("Done !");
	}
}

public class CreateThreadImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=new MyRunnable();
		Runnable r2=new MyRunnable();
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);

		
		t1.setName("one1");
		t2.setName("two2");
		
		t1.start();
		t2.start();
	}

}
