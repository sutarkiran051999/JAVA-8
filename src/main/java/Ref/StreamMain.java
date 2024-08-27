package Ref;

import java.util.List;

public class StreamMain {

	public static void main(String[] args) {
		
		List<Integer>integers =List.of(14,45,694,48,687,4894,64,84,48);
		
		System.out.println(integers);
		
//		integers.stream().forEach(e->{
//			System.out.println(e);
//		});
		
		integers.stream().forEach(System.out::println);
	}
	
}
