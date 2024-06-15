package ThreadDemoExp;


class Tables{
	synchronized void printTable(int n) {				//synchronized method used for run program completely by
		synchronized (this) {
			
		
			for(int i=0;i<=5;i++) {							//the one thread and than perform second thread
				System.out.println(n*i);
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}

class MyThreads extends Thread{
	Tables t;
	MyThreads(Tables t){
		this.t=t;
	}
	public void run() {
		t.printTable(5);
	}
}

class MyThreads1 extends Thread{
	Tables t;
	MyThreads1(Tables t){
		this.t=t;
	}
	public void run() {
		t.printTable(10);
	}
}

public class SynchronizedBlock extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tables obj=new Tables();
		MyThreads t3=new MyThreads(obj);
		MyThreads1 t4=new MyThreads1(obj);
		t3.start();
		t4.start();
		
		
		
	}

}
