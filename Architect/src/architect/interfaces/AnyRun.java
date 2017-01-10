package architect.interfaces;

public class AnyRun {
	public static void main(String[] args) {
		AnyInterface anyInterface0 = new AnyClass();
		AnyClass anyClass = (AnyClass) anyInterface0;
		anyClass.anyMethod();
		AnyInterface anyInterface1 = new AnotherClass();
		AnotherClass anotherClass = (AnotherClass) anyInterface1;
		anotherClass.anyMethod();
	}
}
