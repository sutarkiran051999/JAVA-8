package StreamPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxAndMinNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4,5,45,8,89,5,45,69,844,456,8524,68,24,821);
		
		Optional<Integer> maxNumber = list.stream().max((a,b)->a.compareTo(b));
		
		System.out.println(maxNumber.get());
		
		Optional<Integer> minNumber = list.stream().min((a,b)->a.compareTo(b));
		System.out.println(minNumber.get());
		
		
		Integer maxNumber1 = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(maxNumber1);
		
		Integer minNumber2 = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(minNumber2);
		
		
	}
	
}
