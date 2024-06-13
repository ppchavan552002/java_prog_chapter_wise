package constructorDemoExample;

public class thisDate {
	int dd,mm, yy;
	public thisDate() {
		this(20);
	}
	public thisDate(int dd) {
		this.dd=dd;
	}
	public thisDate(int dd,int mm, int yy) {
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void printDate() {
		System.out.println(dd);
	}
	public void printDate(int dd) {
		System.out.println(dd);
	}
	public void printDate(int dd,int mm, int yy) {
		System.out.println(dd+"-"+mm+"-"+yy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDate m=new thisDate();
		m.printDate();
//		m.thisDate();
		m.printDate(12);
		m.printDate(12,12,1234);
	}
}


