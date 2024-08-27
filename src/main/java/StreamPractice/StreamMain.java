package StreamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args)
	{
		
		List<Integer> list1 = List.of(2,4,5,6,5,6,47,2,458,4,5); // immutable (we cant add and remove the element)
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(45);
		list2.add(56);
		list2.add(49);
		list2.add(5521);
		list2.add(45421);
		list2.add(454);
		list2.add(711);
		list2.add(5685);
		
		List<Integer> list3 = Arrays.asList(4,5,4,6,4,85,4758,745,5,55874); // immutable (we cant add and remove the element)
		
		
		
		//list1
		// without Stream
		
		List<Integer> listEven = new ArrayList<>();
		
		for(Integer i:list1 )
		{
			if(i%2==0)
			{
				listEven.add(i);
			}
		}
		
		System.out.println(list1);
		System.out.println(listEven);
		
		//using stream
		
		
		System.out.println("By Using Stream API");
		
		
		Stream <Integer> stream=list1.stream();
		List<Integer>newList = stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList);
		

//		List<Integer> newList1= list2.stream().filter(i->i>=85).collect(Collectors.toList());
//		System.out.println(newList);
		
		 list2.stream().filter(i -> i >= 85).forEach(System.out::println);
	}
}
