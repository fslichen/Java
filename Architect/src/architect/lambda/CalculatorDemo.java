package architect.lambda;

public class CalculatorDemo {
	public interface Operation {
		int calculate(int a, int b);
	}
	
	public int calculate(int a, Operation operation, int b) {
		return operation.calculate(a, b);
	}
	
	public static void main(String[] args) {
		// Define in-line functions.
		Operation plus = (int a, int b) -> a + b;
		Operation minus = (int a, int b) -> a - b;
		Operation times = (int a, int b) -> a * b;
		Operation divide = (int a, int b) -> a / b;
		// Treat function names as parameters.
		CalculatorDemo anyClass = new CalculatorDemo();
		System.out.println(anyClass.calculate(3, plus, 2));
		System.out.println(anyClass.calculate(3, minus, 2));
		System.out.println(anyClass.calculate(3, times, 2));
		System.out.println(anyClass.calculate(3, divide, 2));
	}
}
