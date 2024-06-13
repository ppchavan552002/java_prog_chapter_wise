package genericCollectionDemo;

class Gen<T>
{
	private T ob;
	Gen(){
		
	}
	Gen(T ob){
		this.ob=ob;
	}
	public T getOb() {
		return ob;
	}
}
public class genericCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Integer> iob=new Gen<Integer>();
		Gen<Integer> iob1=new Gen<Integer>(new Integer(100));
		Gen<String> ios=new Gen<String>("Hello World");
		
		System.out.println(iob.getOb());
		System.out.println(iob1.getOb());
		System.out.println(ios.getOb());
	}

}
