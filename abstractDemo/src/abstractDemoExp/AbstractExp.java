package abstractDemoExp;

abstract class Bank{
	abstract int getRateOfInterest();
}
class SBI extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}
class BOI extends Bank{
	int getRateOfInterest() {
		return 8;
	}
}

public class AbstractExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank() {
			
			@Override
			int getRateOfInterest() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
	}

}
