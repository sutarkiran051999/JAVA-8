package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfTwoNumber {

	public static void main(String[] args) {
		
		List<Integer> sum = Arrays.asList(56,98,12,38,47,02,85,65,77);
		
		 Optional<Integer> result= sum.stream().reduce((a,b)->a+b);
		 System.out.println(result.get());
		
		
		
	}
	
}
