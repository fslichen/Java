package architect.pointer;

import java.util.LinkedList;
import java.util.List;

public class AnyClass {
	public static void main(String[] args) {
		AnyEntity anyEntity = new AnyEntity();
		List<String> strings = new LinkedList<>();
		anyEntity.setStrings(strings);
		System.out.println(anyEntity);
		strings.add("Hello World");
		System.out.println(anyEntity);
	}
}
