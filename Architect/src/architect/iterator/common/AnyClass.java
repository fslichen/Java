package architect.iterator.common;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AnyClass {
	public static void main(String[] args) {
		List<String> strings = new LinkedList<>();
		strings.add("Hello");
		strings.add("World");
		Iterator<String> iterator = strings.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
