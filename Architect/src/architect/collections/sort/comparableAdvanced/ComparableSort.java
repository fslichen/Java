package architect.collections.sort.comparableAdvanced;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableSort {// Sort wrapper class or just one field.
	public static void main(String[] args) {
		List<AnyEntity> list = Arrays.asList(new AnyEntity(45), new AnyEntity(20), new AnyEntity(65));
		Collections.sort(list, (x, y) -> x.getAge().compareTo(y.getAge()));
		System.out.println(list);
	}
}
