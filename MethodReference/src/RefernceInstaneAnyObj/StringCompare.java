package RefernceInstaneAnyObj;

import java.util.Arrays;
import java.util.Comparator;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray= {"Pune","Mumbai","Kolkata","New Delhi"};
		Arrays.sort(strArray, String::compareToIgnoreCase);
		
		for(String str:strArray) {
			System.out.println(str+"");
		}
	}

}
	