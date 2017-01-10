package architect.map.hashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class AnyClass {
	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		map.put(null, null);
		System.out.println(map);
	}
}
