package architect.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortDemo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(11, 13, 17, 2, 3, 5, 7);
		// Ascending Order
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		sortedNumbers.forEach(System.out::println);
	}
}
