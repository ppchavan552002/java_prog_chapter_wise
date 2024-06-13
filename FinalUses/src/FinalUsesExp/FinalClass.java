package FinalUsesExp;

final class game{
	void play() {
		System.out.println("let's play");
	}
}
class coc extends game{
	void play() {
		System.out.println("let's play COC");
	}
}

public class FinalClass {
	public static void main(String[] args) {
		coc c=new coc();
		c.play();
	}
}
