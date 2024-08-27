package StreamPractice;

import java.util.List;
import java.util.stream.Collectors;

public class TakinkOutStaringDigit {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(54,98,596,74,-5847,265,46,74,656);
		
		List<Integer>startingDigit = numbers.stream()
				                                 .map(e->String.valueOf(e))
				                                                           .filter(e->e.startsWith("-5")||e.startsWith("5"))
				                                                                      .map(Integer::valueOf).collect(Collectors.toList());
		
		                     System.out.println(startingDigit);
		
	}
	
}
