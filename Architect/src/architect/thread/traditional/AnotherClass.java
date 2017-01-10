package architect.thread.traditional;

public class AnotherClass extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello World");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}
