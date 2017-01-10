package architect.tricky.extremeValue;

public class AnyClass {
	public static void main(String[] args) {
		// Test Double
		System.out.println(Double.MIN_VALUE);// Double.MIN_VALUE is positive, you'd better double check your evolution project. Well that make sense, that's the most tiny number that java can represent.  
		System.out.println(Double.MAX_VALUE);
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		// Test Double
		System.out.println(Float.MIN_VALUE);// The min value of float is also posivite.
		System.out.println(Float.MAX_VALUE);
		System.out.println(Math.min(Float.MIN_VALUE, 0.0f));
		// Test Integer
		System.out.println(Integer.MIN_VALUE);// The min value of integer is negative.
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.min(Integer.MIN_VALUE, 0));
	}
}
