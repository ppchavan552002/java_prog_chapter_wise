package ThreadDemoExp;

//class TryWaiting extends Thread{
//	public void run() {
//		for(int i=0;i<5;i++) {
//			if(i==3) {
//				Thread.onSpinWait();
//			}
//			System.out.println("thread is running");
//		}
//	}
//}
//
//public class ThreadWaitAndNotify {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		TryWaiting t=new TryWaiting();
//		
//		try {
//			t.start();
//			t.wait();
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//	}	
//}

class WaitMethods implements Runnable{
	public final Object lock;
	
	public WaitMethods(Object lock) {
		this.lock=lock;
	}
	public void run() {
		synchronized (lock) {
			System.out.println("thread is waiting");
			{
				try {
					lock.wait();
				}catch(Exception e) {
					System.out.println(e);
				}
				System.out.println("thread 1 is resumed");
			}
		}
	}
}

public class ThreadWaitAndNotify{
	
	public static void main(String[] args) {
		final Object lock=new Object();
		Thread t=new  Thread(new WaitMethods(lock));
		Thread t1=new  Thread(new Runnable() {
			public void run() {
				synchronized (lock) {
					System.out.println("Thread 2 is notifying");
					lock.notify();
				}
			}
		});
		t.start();
		t1.start();
		
	}
}
