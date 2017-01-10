package architect.collections.reverse;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AnyClass {
	public static void main(String[] args) {
		List<Double> list = new LinkedList<>();
		list.add(3.0);
		list.add(4.0);
		Collections.reverse(list);
		System.out.println(list);
	}
}
