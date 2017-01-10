package architect.thread.join;

public class AnotherClass implements Runnable {
	public void run() {
		while (true) {
			System.out.println("AnotherClass");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
