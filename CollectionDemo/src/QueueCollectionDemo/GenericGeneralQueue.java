package QueueCollectionDemo;

class GeneralClass{
	Object ob;
	GeneralClass(Object ob){
		this.ob=ob;
	}
	Object getOb() {
		return ob;
	}
}

public class GenericGeneralQueue {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("removal")							//remove warning
		GeneralClass g1=new GeneralClass(new Integer(100));
		Integer i1=(Integer)g1.getOb();
		
		GeneralClass g2=new GeneralClass("Hello World");
		String s1=(String)g2.getOb();
		
		System.out.println(i1);
		System.out.println(s1);
	}

}
