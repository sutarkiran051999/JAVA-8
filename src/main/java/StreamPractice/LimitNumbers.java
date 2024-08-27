package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {

	public static void main(String[] args) {
	
		
		List<Integer> list = Arrays.asList(4,67,54,96,48,21,4852,478,147,814,478);
		
		// Taking out limit numbres from array.
		
		List<Integer> limitedNumber = list.stream().limit(5).collect(Collectors.toList());
		System.out.println(limitedNumber);
		
		// Skiping a number from element.
		
		List<Integer> skipingValue = list.stream().skip(5).collect(Collectors.toList());
		
		
		Integer sumOfSkipNumber = list.stream().skip(8).reduce((a,b)->a+b).get();
		System.out.println(skipingValue);
		System.out.println(sumOfSkipNumber);
		
	}
}
