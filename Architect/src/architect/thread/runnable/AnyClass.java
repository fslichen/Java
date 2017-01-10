package architect.thread.runnable;

public class AnyClass {
	public static void main(String[] args) {
		new Thread(new AnotherClass()).start();
		new Thread(new TheOtherClass()).start();
		new Thread(new NewClass() {
			public void run() {// Override the run() method, I believe that this method is more recommended.
				for (int i = 0; i < 100; i++) {
					System.out.println("Happy Birthday");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {}
				}
			}
		}).start();
	}
}
