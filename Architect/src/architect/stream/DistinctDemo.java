package architect.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctDemo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 2, 5, 5, 11, 11);
		List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
		distinctNumbers.forEach(System.out::println);
	}
}
