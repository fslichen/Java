package architect.queue;

import java.util.LinkedList;
import java.util.Queue;

public class AnyClass {
	public static void main(String[] args) {
		Queue<Double> queue = new LinkedList<>();
		queue.add(3.0);
		queue.add(4.0);
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue);
	}
}
