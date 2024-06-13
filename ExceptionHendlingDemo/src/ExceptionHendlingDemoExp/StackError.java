package ExceptionHendlingDemoExp;

class Stack{
	int top=-1;
	int arr[]=new int[5];
	
	
	int pop() {
		if(top== -1) {
			System.out.println("stack is empty");
			return -9999;
		}
		return arr[top--];
	}
}

public class StackError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		int element=s.pop();
		System.out.println(element);
	}

}
