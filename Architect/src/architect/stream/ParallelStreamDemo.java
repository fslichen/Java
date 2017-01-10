package architect.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamDemo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17);
		// Ascending Order
		List<Integer> sortedNumbers = numbers.parallelStream().collect(Collectors.toList());
		sortedNumbers.forEach(System.out::println);
	}
}
