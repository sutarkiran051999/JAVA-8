package StreamPractice;

import java.util.List;

public class SquareOfNumber {

	public static void main(String[] args) {
		
		List<Integer> squareNumber = List.of(45,98,65,74,22,74,89);
		
		double square = squareNumber.stream().map(e->e*e).filter(e-> e>=65).mapToInt(e->e).average().getAsDouble();
		System.out.println(square);
		
	}
	
}
