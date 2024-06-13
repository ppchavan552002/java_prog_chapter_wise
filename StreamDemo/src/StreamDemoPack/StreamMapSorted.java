package StreamDemoPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMapSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<>(Arrays.asList(52,11,33,44,22));
		System.out.println("Ascending order");
		li.stream().sorted()
			.peek(x->System.out.printf(" "))
			.forEach(System.out::print);
		
		System.out.println("\nDencending order");
		li.stream().sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
	}

}
