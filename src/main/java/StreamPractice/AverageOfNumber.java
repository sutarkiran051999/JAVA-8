package StreamPractice;

import java.util.List;

public class AverageOfNumber {

	public static void main(String[] args) {
		
		List<Integer> avg = List.of(4,57,56,7,85,45,156);
		
	    Double result  = avg.stream().mapToInt(e->e).average().getAsDouble();
	    System.out.println(result);
		
	}
	
}
