package StreamDemoPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> res = list.stream()
				.map (value -> value * 10)
				.collect (Collectors.toList());
		System.out.println(Arrays.toString(res.toArray()));
	}

}
