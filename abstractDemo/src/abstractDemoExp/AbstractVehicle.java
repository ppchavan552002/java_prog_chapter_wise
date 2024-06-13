package abstractDemoExp;

abstract class Vehicle{
	abstract void start(); 						//also require abstract with data type
	void stop(){
		System.out.println("the Vehicle is stopped");
	}
}
class Car extends Vehicle{
	
	
	void start() {
		System.out.println("The car start with kay");
	}
}
class Motorcycle extends Vehicle{

	@Override /*annotation but rigth know its not vary importent*/
	void start() {
		// TODO Auto-generated method stub
		System.out.println("start with button");
	}
	
}

public class AbstractVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle a=new Car();
		Vehicle b=new Motorcycle();   		//we cannot create object of abstract class and also require abstract with data type
		
		a.start();
		a.stop();
		b.start();
		b.stop();
	}

}
