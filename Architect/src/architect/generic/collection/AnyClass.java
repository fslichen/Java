package architect.generic.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class AnyClass {
	public <V> void anyMethod(Class<? extends Collection> clazz) {
		System.out.println(clazz.getName());
	}
	
	@Test
	public void test() {
		List<String> anyList = new ArrayList<>();
		anyMethod(anyList.getClass());
		Set<String> anySet = new HashSet<>();
		anyMethod(anySet.getClass());
		Map<String, String> anyMap = new HashMap<>();
//		anyMethod(anyMap.getClass()); This code is not working because map does not extend Collection.
	}
}
