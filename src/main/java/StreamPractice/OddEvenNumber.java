package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumber {

	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(4,58,45,74,22,46,74,25,56);
		
		List<Integer>evenNumber=number.stream().filter(e-> e%2==0).collect(Collectors.toList());
		System.out.println("The Numbers are EVEN :- "+evenNumber);
		
		List<Integer>oddNumber = number.stream().filter(e-> e%2!=0).collect(Collectors.toList());
		System.out.println("The Numbers are ODD :- "+oddNumber);
       
	}

}
