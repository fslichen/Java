package architect.arrays;

import java.util.Arrays;
import java.util.List;

public class AnyClass {
	public static void main(String[] args) {
		String[] strings = {"Hello", "World"};
		List<String> list = Arrays.asList(strings);
		System.out.println(list);
		list.toArray();
	}
}
