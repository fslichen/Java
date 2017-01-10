package architect.collection.set.hashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AnyClass {
	public static void main(String[] args) {
		Set<String> set0 = new HashSet<>();
		set0.add(null);
		Set<String> set1 = new TreeSet<>();
		set1.add(null);// TreeSet does not allow a null value. 
	}
}
