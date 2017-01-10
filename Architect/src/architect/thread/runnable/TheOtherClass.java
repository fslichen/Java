package architect.thread.runnable;

public class TheOtherClass implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Goodbye Past");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}
