package architect.lambda;

public class InlineFunction {
	public interface AnyFunction {// You are allowed to attach an interface within the class.
		public int anyMethod(int x);
	}
	
	public static void main(String[] args) {
		AnyFunction anyFunction = x -> x + 10;// Define an inline function.
		int result = anyFunction.anyMethod(5);
		System.out.println(result);
		anyFunction = x -> x * 10;
		result = anyFunction.anyMethod(5);
		System.out.println(result);
	}
}	
