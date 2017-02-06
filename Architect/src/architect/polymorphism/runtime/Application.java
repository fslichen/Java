package architect.polymorphism.runtime;

public class Application {
	public static void main(String[] args) {
		SuperClass clazz = new SubClass();// Runtime polymorphism always happens in a inheritance context.
		clazz.anyMethod();
	}
}
