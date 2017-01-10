package architect.exception.tryFinally;

public class AnyClass {
	public static void main(String[] args) {
		try {
			double i = 1 / 0.0000000001;
		} finally {// The catch block is not required. Try should either be followed by catch or finally.
			System.out.println("Hello World");
		}
	}
}
