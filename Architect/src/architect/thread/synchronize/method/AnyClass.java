package architect.thread.synchronize.method;

public class AnyClass {
	int ticketCount = 100;
	public synchronized void sell() {// The synchronized method guarantees the thread safety.
		ticketCount--;
		System.out.println("Ticket Count = " + ticketCount);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		AnyClass anyClass = new AnyClass();
		new Thread(new Salesman0() {
			public void run() {
				while (anyClass.ticketCount > 0) {
					anyClass.sell();
				}
			}
		}).start();
		
		new Thread(new Salesman1() {
			public void run() {
				while (anyClass.ticketCount > 0) {
					anyClass.sell();
				}
			}
		}).start();
	}
}
