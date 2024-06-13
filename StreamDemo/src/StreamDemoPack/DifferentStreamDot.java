package StreamDemoPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DifferentStreamDot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> ans=li.stream()
				.limit(3)
				.collect(Collectors.toList());
		System.out.println(ans);
		
		List<Integer> ans1=li.stream()
				.skip(2)
				.collect(Collectors.toList());
				
		System.out.println(ans1);
		
		
		li.stream().forEach(System.out::println);
		System.out.println("without order");
		li.stream().parallel().forEach(x->System.out.println("value : "+x));
		System.out.println("with order");
		li.stream().parallel().forEachOrdered(x->System.out.println("value : "+x));
	}

}