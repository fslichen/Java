package architect.annotation;

import org.junit.Test;


public class AnyClass {
	@AnyAnnotation(name = "Chen", gender = "M")
	public void anyMethod() {
		try {
			AnyAnnotation anyAnnotation = this.getClass().getMethod("anyMethod").getAnnotation(AnyAnnotation.class);
			String name = anyAnnotation.name();
			String gender = anyAnnotation.gender();
			System.out.println("Name = " + name + " Gender = " + gender);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test() throws NoSuchMethodException, SecurityException {
		anyMethod();
	}
}
