package architect.thread.traditional;

public class TheOtherClass extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Goodbye Past");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}
