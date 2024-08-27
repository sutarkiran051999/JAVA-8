package StreamPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(45,6958,85,45,23,85,358,3582,6,465,8225,6,55,254,5865,45);
		
		//Acessingding Order Sorting.
		
		List<Integer> asccendingSorting = list.stream().sorted().collect(Collectors.toList());
		System.out.println(asccendingSorting);
		
		List<Integer> decssindingSorting = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(decssindingSorting);
		
		
		
	}
	
}
