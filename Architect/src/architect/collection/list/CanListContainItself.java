package architect.collection.list;

import java.util.LinkedList;
import java.util.List;

public class CanListContainItself {
	public static void main(String[] args) {
		List<Object> list = new LinkedList<>();
		list.add("Hello World");
		list.add(list);
		System.out.println(list);// Yes it could.
	}
}
