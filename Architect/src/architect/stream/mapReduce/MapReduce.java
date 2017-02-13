package architect.stream.mapReduce;

import java.util.Arrays;

public class MapReduce {
	public String combineString() {
		String combinedSentence = Arrays.asList("Hello", "World").stream().map(x -> x).reduce("", (x, y) -> x + y);
		return combinedSentence;
	}
	
	public int product() {
		int product = Arrays.asList(1, 3, 4, 5, 2).stream().map(x -> x)
				.reduce(1, (x, y) -> x * y);// x servers as the cumulative product, and y is the current element.
		// The first element can be regarded as the initial value of the cumulative product. In this case it should be one.
		return product;
	}
	
	public static void main(String[] args) {
		MapReduce m = new MapReduce();
		System.out.println(m.combineString());
		System.out.println(m.product());
	}
}
