package FunctionalInterface;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		
		Function<Integer,Double> function = a-> a/2.0;
		
		System.out.println(function.apply(10));
		
	}
	
}
