package architect.generic.heir;

import org.junit.Test;

public class AnyClass {
	public void anyMethod(Class<? extends AbstractClass> clazz) {
		System.out.println(clazz.getName());
	}
	
	@Test
	public void test() {
		anyMethod(SpecificClass0.class);
//		anyMethod(SpecificClass1.class); This code is not going to work because SpecificClass1 does not extend from AbstractClass.
	}
}
