package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {

		// Stream API - collection process
		// collection / group of object

		List<String> names = List.of("Kiran", "Tejas", "Rohit", "Rahul", "Mohoit");

		List<Integer> number = Arrays.asList(458, 95, 88, 65, 865, 685, 4, 58);

		Stream<String> startingLetter = names.stream();
		List<String> staringCharater = startingLetter.filter(e -> e.startsWith("R")).collect(Collectors.toList());
		System.out.println(staringCharater);

		Stream<Integer> numberOperation = number.stream();
		List<Integer> opreation = numberOperation.map(i -> i * 2).collect(Collectors.toList());
		System.out.println(opreation);

		Stream<Integer> numberOperation1 = number.stream();
		numberOperation1.sorted().forEach(System.out::println);

		Stream<Integer> numberOperation2 = number.stream();
		Integer minNum = numberOperation2.min((x, y) -> x.compareTo(y)).get();

		System.out.println("Minimum Number");

		System.out.println(minNum);

//		Stream<Integer> numberOpreation3 = number.stream();
//		Integer maxNum = numberOpreation3.max((x, y) -> x.compareTo(y)).get();
//
//		System.out.println(maxNum);
		
		Integer getMax = number.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(getMax);

	}

}
