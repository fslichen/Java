package architect.collection.set.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class AnyClass {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add(null);// TreeSet does not allow a null value because it is not sortable.
	}
}
