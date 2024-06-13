package StringProgDemo;

public class StringNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String[] words=new String[10];
		String word=words[5].toLowerCase();
		System.out.println(word);
		}catch(Exception e) {
			System.out.println("In String Array don't have any value");
		}
	}

}
