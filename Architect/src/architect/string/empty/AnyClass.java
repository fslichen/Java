package architect.string.empty;

import java.util.LinkedList;
import java.util.List;

public class AnyClass {
	public static void main(String[] args) {
		System.out.println(null + "");
		List<String> strings = new LinkedList<>();
		strings.add(null);
		strings.add(null);
		System.out.println(strings);
	}
}
