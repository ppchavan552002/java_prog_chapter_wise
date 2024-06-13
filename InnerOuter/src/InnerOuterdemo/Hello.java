package InnerOuterdemo;

interface HelloWorld{
	public void Greating(String name);
}

public class Hello {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloWorld g=(String name) -> {
			System.out.println("Hello "+name);
		};
		g.Greating("Pratahmesh");
	}
}
