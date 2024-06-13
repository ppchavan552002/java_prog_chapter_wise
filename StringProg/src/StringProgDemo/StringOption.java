package StringProgDemo;

import java.util.Optional;

public class StringOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words=new String[10];
		words[0]="game";
		words[1]="game";
		words[2]="game";
		words[3]="game";
		words[4]="game";
		words[5]="game";
		words[6]="game";
		
		Optional<String> checkNull=Optional.ofNullable(words[5]);
		if(checkNull.isPresent()) {
			String word =words[5].toLowerCase();
			System.out.println(word);
		}else {
			System.out.println("String word is null");
		}
	}

}
