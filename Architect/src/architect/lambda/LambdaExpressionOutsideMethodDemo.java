package architect.lambda;

import java.util.function.Function;

public class LambdaExpressionOutsideMethodDemo {
	// The in-line function can reside inside or outside of a method.
	public Function<String, String> function = (String string) -> string + ".";
	
	public static void main(String[] args) {
		LambdaExpressionOutsideMethodDemo demo = new LambdaExpressionOutsideMethodDemo();
		System.out.println(demo.function.apply("Hello world"));
	}
}
