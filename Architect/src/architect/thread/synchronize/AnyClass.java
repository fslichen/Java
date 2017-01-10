package architect.thread.synchronize;

public class AnyClass {
	private static int ticketCount = 10000;
	public static synchronized boolean sell() {
		if (ticketCount > 0) {
			ticketCount--;
			System.out.println("Ticket Count = " + ticketCount);
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Thread thread0 = new Thread() {
			public void run() {
				while (sell()) {
					System.out.println("Station I has sold one ticket.");
				}
			}
		};
		Thread thread1 = new Thread() {
			public void run() {
				while (sell()) {
					System.out.println("Station II has sold one ticket.");
				}
			}
		};
		thread0.start(); 
		thread1.start(); 
	}
}
