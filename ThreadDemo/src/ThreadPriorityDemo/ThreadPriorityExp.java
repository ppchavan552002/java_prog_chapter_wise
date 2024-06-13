package ThreadPriorityDemo;

public class ThreadPriorityExp extends Thread {
	 private String threadName;

	    public ThreadPriorityExp(String name) {
	        this.threadName = name;
	    }

	    @Override
	    public void run() {
	       
	        for (int i = 0; i < 10; i++) {
	            System.out.println(threadName + " with priority " + this.getPriority() + " is executing");
	            try {
	                Thread.sleep(100); 
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        
	    	ThreadPriorityExp th1 = new ThreadPriorityExp("Thread 1");
	    	ThreadPriorityExp th2 = new ThreadPriorityExp("Thread 2");
	    	ThreadPriorityExp th3 = new ThreadPriorityExp("Thread 3");

	       
	        th1.setPriority(6); // Medium-high priority
	        th2.setPriority(3); // Low priority
	        th3.setPriority(9); // High priority

	        
	        th1.start();
	        th2.start();
	        th3.start();

	        
	        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());

	       
	        Thread.currentThread().setPriority(10);

	       
	        System.out.println("Main thread new priority: " + Thread.currentThread().getPriority());
	    }
	}