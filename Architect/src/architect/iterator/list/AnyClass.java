package architect.iterator.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class AnyClass {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Hello");
		list.add("World");
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
