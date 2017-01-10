package architect.thread.interrupt;

public class AnyClass {
	public static void main(String[] args) {
		new Thread(new AnotherClass() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						System.out.println("Thread I has been interrupted.");
					}
				}
			}
		}).start();
		new Thread(new TheOtherClass() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						System.out.println("Thread II has been interrupted.");
					}
				}
			}
		}).start();
	}
}
