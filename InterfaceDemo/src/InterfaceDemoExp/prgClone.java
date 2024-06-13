package InterfaceDemoExp;

public class prgClone implements Cloneable {
	int id;
	String name;
	prgClone(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		prgClone s=new prgClone(101,"Prathamesh");
		System.out.println(s.id+" "+s.name);
		
		try {
			prgClone s1=(prgClone)s.clone();
			System.out.println(s1.id+" "+s1.name);
		}catch(Exception e){
			System.out.println(s.toString());
		}
		
	}

}
