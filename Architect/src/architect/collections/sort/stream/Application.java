package architect.collections.sort.stream;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
	public static void main(String[] args) {
		List<AnyClass> list = new LinkedList<>();
		list.add(new AnyClass(25, 4000d));
		list.add(new AnyClass(26, 5000d));
		list.add(new AnyClass(26, 4000d));
		list.add(new AnyClass(23, 2000d));
		list.add(new AnyClass(23, 3000d));
		list = list.stream()
		.sorted(Comparator.comparing(AnyClass::getAge).reversed().thenComparing(AnyClass::getSalary))
		.collect(Collectors.toList());
		System.out.println(list);// Sort the age in descending order, and the salary in ascending order. 
	}
}
