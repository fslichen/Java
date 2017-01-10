package architect.lambda;

import java.util.LinkedList;
import java.util.List;

public class MethodIteration {
	public static void main(String[] args) {
		List<String> strings = new LinkedList<>();
		strings.add("Hello World");
		strings.add("Goodbye Past");
		strings.forEach(System.out::println);// The double colon represents method reference.
	}
}	
