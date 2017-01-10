package architect.map.hashtable;

import java.util.Hashtable;

public class AnyClass {
	public static void main(String[] args) {
		Hashtable<String, String> hashTable = new Hashtable<>();
		hashTable.put(null, null);// An exception will be thrown out.
		System.out.println(hashTable);
	}
}
