package architect.collection.set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class AnyClass {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add(null);
		System.out.println(set);
	}
}
