package architect.number;

import org.junit.Test;

public class AnyClass {
	@Test
	public void anyMethod() {
		Long unsigedLong = Integer.toUnsignedLong(5);
		System.out.println(unsigedLong);
		String unsignedString = Integer.toUnsignedString(5);
		System.out.println(unsignedString);
		int comparisonResult = Integer.compareUnsigned(5, 6);
		System.out.println(comparisonResult);
		int max = Integer.max(5, 6);
		System.out.println(max);
		int sum = Integer.sum(6, 5);
		System.out.println(sum);
	}
}
