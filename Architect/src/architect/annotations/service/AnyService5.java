package architect.annotations.service;

import org.junit.Test;

import architect.annotations.annotation.AnyAnnotation5;


public class AnyService5 {
	@AnyAnnotation5(name = "Chen", gender = "M")
	public void anyMethod() throws NoSuchMethodException, SecurityException {
		AnyAnnotation5 anyAnnotation5 = this.getClass().getMethod("anyMethod").getAnnotation(AnyAnnotation5.class);
		String name = anyAnnotation5.name();
		String gender = anyAnnotation5.gender();
		System.out.println("Name = " + name + " Gender = " + gender);
	}
	
	@Test
	public void test() throws NoSuchMethodException, SecurityException {
		anyMethod();
	}
}
