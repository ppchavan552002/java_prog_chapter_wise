package StreamDemoPack;

import java.util.stream.Stream;

public class StreamArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] num= {1,2,3,4,5,6,7,8,9};
		Stream<Integer> stream=Stream.of(num);
		
		stream.filter(x->x>5).forEach(System.out::println);
	}

}
