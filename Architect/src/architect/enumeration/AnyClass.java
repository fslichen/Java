package architect.enumeration;

import java.util.Enumeration;
import java.util.Hashtable;

public class AnyClass {
	public static void main(String[] args) {
		Hashtable<String, String> table = new Hashtable<>();
		table.put("0", "Hello");
		table.put("1", "World");
		Enumeration<String> enumeration = table.keys();
		while (enumeration.hasMoreElements()) {
			String key = enumeration.nextElement();
			System.out.println(key);
			table.remove(key);// Enumeration is not fail-fast.
		}
	}
}
