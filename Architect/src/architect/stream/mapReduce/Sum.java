package architect.stream.mapReduce;

import java.util.Arrays;

public class Sum {
	public static void main(String[] args) {
		int sum = Arrays.asList(5, 3, 2, 3).stream().mapToInt(x -> x).sum();
		System.out.println(sum);
	}
}
