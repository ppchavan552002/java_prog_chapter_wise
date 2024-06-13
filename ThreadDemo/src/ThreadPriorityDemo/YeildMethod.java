package ThreadPriorityDemo;

public class YeildMethod extends Thread {
	
	public String threadName;
	
	public YeildMethod(String name) {
		this.threadName=name;
	}
	
	public void run() {
		for(int i=0;i<=4;i++) {
			System.out.println(threadName+" is Executing");
			Thread.yield();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YeildMethod y=new YeildMethod("Thread 1");
		YeildMethod y1=new YeildMethod("Thread 2");
		
		y.start();
		y1.start();
		
	}

}
