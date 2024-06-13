package javaDynamicExp;

class DoubleNum{
	
	public Number getObject() {
		return new Double(23.5);
	}
}
class IntegerNum extends DoubleNum{
	public Integer getObject() {					//manager value
		return new Integer(23);
	}
}
public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerNum i=new IntegerNum();
		Number d=i.getObject();
		System.out.println(d);
	}

}
