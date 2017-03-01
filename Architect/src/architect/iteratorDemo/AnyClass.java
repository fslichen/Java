package architect.iteratorDemo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AnyClass {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Hello", "World");
		int i = 0;
		Iterator<String> iterator = strings.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			strings.remove(i);// Throw out java.lang.UnsupportedOperationException because iterator is fail fast.
			i++;
		}
	}
}
