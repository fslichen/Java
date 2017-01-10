package architect.lambda.template;

import java.util.function.ToIntFunction;

public class ToIntFunctionDemo {
	public static void main(String[] args) {
		ToIntFunction<String> toIntFunction = (String string) -> string.length() % 2 == 0 ? 0 : 1;
		System.out.println(toIntFunction.applyAsInt("Hello World"));
		System.out.println(toIntFunction.applyAsInt("Goodbye Past"));
	}
}
