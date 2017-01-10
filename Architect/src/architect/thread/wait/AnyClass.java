package architect.thread.wait;

public class AnyClass {
	public static void main(String[] args) {
		AnotherClass anotherClass = new AnotherClass();
		anotherClass.run();
		try {
			anotherClass.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
