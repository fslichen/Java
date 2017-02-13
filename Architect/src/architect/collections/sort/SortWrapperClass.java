package architect.collections.sort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortWrapperClass {
	public static void main(String[] args) {
		List<Double> numbers = new LinkedList<>();
		numbers.add(4.0);
		numbers.add(3.0);
		Collections.sort(numbers);
		System.out.println(numbers);
	}
}
