package InnerOuterdemo;

@FunctionalInterface
interface funatinalWork {
	void say(String msg);
}
public class functinalWork1 implements funatinalWork{
	public void say(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		functinalWork1 f=new functinalWork1();
		f.say("hello there");
	}
}

