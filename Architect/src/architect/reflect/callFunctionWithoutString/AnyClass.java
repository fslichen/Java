package architect.reflect.callFunctionWithoutString;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnyClass {
	public double sin(Double x) {
		return Math.sin(x);
	}
	
	public double calculate(Class<? extends Object> clazz, double x) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method method = this.getClass().getMethod(clazz.getSimpleName().toLowerCase(), Double.class);
		return (double) method.invoke(this, x);
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		double result = new AnyClass().calculate(Sin.class, 1.57);// So you don't need to write like "sin", which causes problems.
		System.out.println(result);
	}
}
