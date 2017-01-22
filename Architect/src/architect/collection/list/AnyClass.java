package architect.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnyClass {
	public static void main(String... args) {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
		System.out.println(list);
	}
}
