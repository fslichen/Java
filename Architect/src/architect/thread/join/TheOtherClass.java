package architect.thread.join;

public class TheOtherClass implements Runnable {
	public void run() {
		while (true) {
			System.out.println("TheOtherClass");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
