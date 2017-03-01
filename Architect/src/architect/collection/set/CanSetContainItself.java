package architect.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class CanSetContainItself {
	public static void main(String[] args) {
		Set<Object> set = new LinkedHashSet<>();
		set.add("Hello World");
		set.add(set);
		System.out.println(set);// Yes it could, obviously this is a major mathematical bug.
	}
}
