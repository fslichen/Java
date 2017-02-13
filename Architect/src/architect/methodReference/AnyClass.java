package architect.methodReference;

import java.util.LinkedList;
import java.util.List;

public class AnyClass {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Hello");
		list.add("World");
		list.stream().forEach(System.out::println);// This is a static method reference.
	}
}
