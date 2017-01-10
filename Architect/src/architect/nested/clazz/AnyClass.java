package architect.nested.clazz;

import org.junit.Test;

public class AnyClass {
	private double x = 3.0;
	private static double y = 4.0;
	class AnotherClass {// inner class
		public void anyMethod() {
			System.out.println(x);
		}
	}
	
	static class TheOtherClass {// nested class
		public void anyMethod() {
			System.out.println(y);
		}
	}
	
	public interface anyInterface {
		public void anyMethod();
	}

	@Test
	public void test() {
		AnotherClass anotherClass = new AnotherClass();
		anotherClass.anyMethod();
		TheOtherClass theOtherClass = new TheOtherClass();
		theOtherClass.anyMethod();
	}
}
