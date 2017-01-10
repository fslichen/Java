package architect.thread.join;

public class AnyClass {
	public static void main(String[] args) throws InterruptedException {
		Thread thread0 = new Thread(new AnotherClass());
		Thread thread1 = new Thread(new TheOtherClass());
		thread0.start();
		thread0.join();// When the join() method is called, thread0 should be finished before thread1 starts. And when join() is called, you'll find that the program just runs in order, just like running an application without using the thread.
		thread1.start();
	}
}
