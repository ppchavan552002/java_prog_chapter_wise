package StreamDemoPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<>(Arrays.asList(1,2,3,4,5,5,6));
		
		List<Integer> res=li.stream()
				.filter(value->value%2==0)
				.peek(value->System.out.println("Filtered "+value))
				.map(value->value*10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(res.toArray()));
		
		List<Integer> ans=li.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(ans);
	}

}
