package architect.thread.traditional;

public class AnyClass {
	public static void main(String[] args) {
		new AnotherClass().start();
		new TheOtherClass().start();
	}
}
