package StreamDemoPack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStreamListMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Jaspreet","Jim","Anagha", "riya","Meera");
		
		List<String> filteredName=names.stream()
				.filter(name->name.startsWith("J"))			
				.map(name->name.toUpperCase())				//String::toUpperCase
				.collect(Collectors.toList());
		
		for(String s:filteredName) 
			System.out.println(s);
	}

}
