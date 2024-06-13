package StreamDemoPack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStreamExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<>();
		li=Stream.of(1,2,3,4,5)
			.filter(x->x%2==0)
			.collect(Collectors.toList());
		
		System.out.println(li);
		
//		List<String> name=Arrays.asList("Jaspreet","Jim","Anagha", "riya");
 	}

}
