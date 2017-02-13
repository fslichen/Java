package architect.lambda;

public class ComparisonBtwInlineAndFunctionNameAsParameter {
	public interface Function {
		public double calculate(double x);
	}
	
	public double calculate(Function template, double x) {
		return template.calculate(x);
	}
	
	public static void main(String[] args) {
		Function function = x -> x + 10;
		double y = function.calculate(10);
		System.out.println(y);
		y = new ComparisonBtwInlineAndFunctionNameAsParameter().calculate(function, 10);
		System.out.println(y);
	}
}		
