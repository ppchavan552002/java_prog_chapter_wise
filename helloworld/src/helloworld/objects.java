package helloworld;

public class objects {
	
	private int day, month, year;
	
	public void initDate() {
		day=30;
		month=4;
		year=2012;
	}
	
	public void printDate() {
		System.out.println("date is : "+ day + "/" + month +"/" + year);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objects d=new objects();
		d.initDate();
		d.printDate();
	}

}
