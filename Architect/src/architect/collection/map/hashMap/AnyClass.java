package architect.collection.map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class AnyClass {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("key", "value");
		map.put(null, null);
		System.out.println(map);
	}
}
