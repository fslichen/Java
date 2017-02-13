package architect.forEach;

import java.util.Arrays;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "World", "White", "Blue", "California");
		list.stream().forEach(x -> {
			if (x.length() == 5) {
				System.out.println("The length is 5.");
			} else if (x.length() == 4) {
				System.out.println("The length is 4.");
			} else {
				System.out.println("The length is unknown.");
			}
		});
	}
}
