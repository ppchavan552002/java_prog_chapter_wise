package constructorDemoExample;

public class ThisExample {
	
	int i;
	void setvalue(int i) {
		this.i=i;
	}
	void show() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisExample t=new ThisExample();
		t.setvalue(23);
		t.show();
	}

}
