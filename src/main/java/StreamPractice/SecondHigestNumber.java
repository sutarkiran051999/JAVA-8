package StreamPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHigestNumber {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(30,6,52,59,45,65,21,45,2,5,48,9,8,54,58,14,7,1,4,45);
		
		// Second Lower Number.
		
		Integer secondHeighest = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get(); //distinct is used to not taking a duplicate value.
		System.out.println(secondHeighest);
		
		// Second Heighest Number
		
		Integer secondLowestNumber = list.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
		System.out.println(secondLowestNumber);
	}

}
