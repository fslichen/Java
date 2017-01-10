package architect.thread.synchronize.statement;

public class AnyClass {
	int ticketCount = 100;
	public void sell() {// The synchronized method guarantees the thread safety.
		// Synchronization can simply be viewed as a mechanism to protect an object, so that only one thread can get access to the object at one time. 
		synchronized(this) {// This is actually the same as the synchronized method. That actually means that this, including the ticket count is protected. And therefore only one thread can get access to this, or the the ticketCount.
			ticketCount--;
			System.out.println("Ticket Count = " + ticketCount);
		}
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
