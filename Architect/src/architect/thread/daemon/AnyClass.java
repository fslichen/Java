package architect.thread.daemon;

public class AnyClass {
	public static void main(String[] args) {
		Thread daemonThread = new Thread(new AnotherClass() {
			public void run() {
				while (true) {
					System.out.println("Daemon Thread");
				}
			}
		});
		Thread thread = new Thread(new TheOtherClass() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Main Thread");
				}
			}
		});
		thread.start();
		daemonThread.setDaemon(true);
		daemonThread.start();
	}
}
