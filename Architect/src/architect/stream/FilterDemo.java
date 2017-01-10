package architect.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Apple", "Pear", "Peach", "Peanut", "Walnut", "Coconut");
		List<String> filteredStrings = strings.stream().filter(string -> string.length() % 2 == 0).collect(Collectors.toList());
		filteredStrings.forEach(System.out::println);
	}
}
