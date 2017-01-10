package architect.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StatisticsDemo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(11, 13, 17, 2, 3, 5, 7);
		IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println(intSummaryStatistics.getAverage());
	}
}
