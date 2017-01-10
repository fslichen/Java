package architect.lambda.template;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		// Make use of the available templates so that you don't need to write your own interface within the class.
		Function<String, String> function = (String string) -> string + ".";// Accept one parameter and generate a result.
		String result = function.apply("Hello world");
		System.out.println(result);
	}
}
