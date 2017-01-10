package architect.arrays;

import java.util.LinkedList;
import java.util.List;

public class List2Array {
	public static void main(String[] args) {
		List<String> strings = new LinkedList<>();
		strings.add("Hello");
		strings.add("World");
		String[] stringArray = new String[2];
		strings.toArray(stringArray);
		for (String string : stringArray) {
			System.out.println(string);
		}
	}
}
