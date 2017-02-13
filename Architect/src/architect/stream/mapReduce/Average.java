package architect.stream.mapReduce;

import java.util.Arrays;

public class Average {
	public static void main(String[] args) {
		Double average = Arrays.asList(5d, 3d, 2d, 3d).stream().mapToDouble(x -> x).average().getAsDouble();
		System.out.println(average);
	}
}
