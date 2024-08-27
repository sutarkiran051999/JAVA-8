package StreamPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		List<Integer>numbers = Arrays.asList(55,88,55,44,75,88,56,44,98,97,62);
		
	    Set<Integer> dup =numbers.stream().filter(e-> Collections.frequency(numbers, e)>1).collect(Collectors.toSet());
	    System.out.println(dup);
		
	    // With a HashSet
	    
	    Set<Integer> dup1 = new HashSet<>();
	    Set<Integer> dupNumber=numbers.stream().filter(e->!dup1.add(e)).collect(Collectors.toSet());
	    System.out.println(dupNumber);
	    
	}
	
}
