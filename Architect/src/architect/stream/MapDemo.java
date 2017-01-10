package architect.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17);
		// Reminds me of x |-> x + 1 in mathematics's projection.
		List<Integer> mappedNumbers = numbers.stream().map(x -> x + 1).collect(Collectors.toList());
		mappedNumbers.forEach(System.out::println);
	}
}
