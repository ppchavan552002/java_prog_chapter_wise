package ThreadDemoExp;

class Table{
	synchronized void printTable(int n) {				//synchronized method used for run program completely by
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

class MyThread extends Thread{
	Table t;
	MyThread(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(5);
	}
}

class MyThread1 extends Thread{
	Table t;
	MyThread1(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(10);
	}
}

public class SynchronizedMethod extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj=new Table();
		MyThread t1=new MyThread(obj);
		MyThread1 t2=new MyThread1(obj);
		t1.start();
		t2.start();
		
		
		
	}

}
