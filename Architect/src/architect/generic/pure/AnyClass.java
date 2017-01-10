package architect.generic.pure;

import org.junit.Test;

public class AnyClass {
	// ? is a place holder which says I don't care or know what generic type is.
	public <T> void anyMethod(Class<?> clazz) {
		System.out.println(clazz.getName());
	}
	
	@Test
	public void test() {
		anyMethod(String.class);
	}
	
}
