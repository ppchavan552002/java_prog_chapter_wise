package StreamDemoPack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BuildStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<Integer>();
		li.add(34);
		li.add(454);
		li.add(54);
		li.add(23);
		
		Stream<Integer> stream=li.stream();
		
		stream
		.filter(i->i>45)
		.forEach(System.out::println);
				
	}

}
