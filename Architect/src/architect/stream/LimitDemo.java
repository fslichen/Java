package architect.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitDemo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17);
		List<Integer> limitedNumbers = numbers.stream().limit(2).collect(Collectors.toList());
		limitedNumbers.forEach(System.out::println);
	}
}
