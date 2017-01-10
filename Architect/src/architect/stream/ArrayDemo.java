package architect.stream;

import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;

public class ArrayDemo {
	public static void main(String[] args) {
		List<int[]> arrays = new LinkedList<>();
		int[] array0 = {67, 107};
		int[] array1 = {68, 122};
		arrays.add(array0);
		arrays.add(array1);
		// This reminds me of R^2 -> R in mathematics. The lambda expression has turn programming from control dominated (if, for, while, etc.) to mathematical concept dominated. That is why Python is so tightly coupled with scientific computinig. 
		IntSummaryStatistics valleyValuesSummaryStatistics = arrays.stream().mapToInt(x -> x[0]).summaryStatistics();
		System.out.println(valleyValuesSummaryStatistics.getAverage());
		IntSummaryStatistics peakValuesSummaryStatistics = arrays.stream().mapToInt(x -> x[1]).summaryStatistics();
		System.out.println(peakValuesSummaryStatistics.getAverage());
	}
}
