package architect.collection.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

import org.junit.Test;

public class ListApiDemo {
	@Test
	public void listIterator() {
		List<String> strings = new LinkedList<>(Arrays.asList("Apple", "Banana"));
		ListIterator<String> iterator = strings.listIterator();
		assert iterator.hasPrevious() == false;
		assert iterator.hasNext() == true;
		while (iterator.hasNext()) {
			String string = iterator.next();
		}
		while (iterator.hasPrevious()) {
			String string = iterator.previous();
		}
	}
	
	@Test
	public void isEmpty() {
		List<String> strings = new LinkedList<>(Arrays.asList("Apple", "Banana"));
		assert strings.isEmpty() == false;
	}
	
	@Test
	public void containsAll() {
		List<String> strings = new LinkedList<>(Arrays.asList("Apple", "Banana", "Coconut"));
		assert strings.containsAll(Arrays.asList("Apple", "Banana")) == true;
	}
	
	@Test
	public void retainAll() {
		List<String> strings = new LinkedList<>(Arrays.asList("Apple", "Banana", "Coconut"));
		strings.retainAll(Arrays.asList("Banana", "Coconut"));// Intersection
		assert Arrays.asList("Banana", "Coconut").containsAll(strings);
	}
	
	@Test
	public void lastIndexOf() {
		List<String> strings = new LinkedList<>(Arrays.asList("Apple", "Apple", "Apple"));
		assert strings.lastIndexOf("Apple") == 2;
	}
	
	@Test
	public void indexOf() {
		List<String> strings = new LinkedList<>(Arrays.asList("Apple", "Apple", "Apple"));
		assert strings.indexOf("Apple") == 0;// First Index
	}
	
	@Test
	public void removeAll() {
		List<String> strings = new LinkedList<>(Arrays.asList("Apple", "Banana", "Coconut"));
		strings.removeAll(Arrays.asList("Apple", "Banana"));
		assert strings.get(0).equals("Coconut");
	}
	
	@Test
	public void sort() {
		List<String> strings = new LinkedList<>(Arrays.asList("Banana", "Apple", "Coconut"));
		strings.sort((x, y) -> x.hashCode() - y.hashCode());
		strings.sort(new Comparator<String>() {
			@Override
			public int compare(String arg0, String arg1) {
				return arg0.hashCode() - arg1.hashCode();
			}
		});
	}
	
	@Test
	public void removeIf() {
		List<String> strings = new LinkedList<>(Arrays.asList("Banana", "Apple", "Coconut"));
		strings.removeIf(x -> x.hashCode() % 2 == 0);
		Arrays.asList("Banana", "Coconut").containsAll(strings);
		strings.removeIf(new Predicate<String>() {
			@Override
			public boolean test(String arg0) {
				return arg0.hashCode() % 2 == 0;
			}
		});
	}
	
	@Test
	public void linkedList() {
		
	}
}
