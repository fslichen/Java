package architect.collections.sort.comparatorAdvanced;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ComparatorSort {// Can sort multiple fields.
	public static void main(String[] args) {
		List<AnyEntity> list = new LinkedList<>();
		list.add(new AnyEntity(20, 4000d));
		list.add(new AnyEntity(25, 5000d));
		list.add(new AnyEntity(35, 6000d));
		list.add(new AnyEntity(20, 2000d));
		Comparator<AnyEntity> comparator = Comparator.comparing(AnyEntity::getAge).reversed()
		.thenComparing(AnyEntity::getSalary);		
		Collections.sort(list, comparator);
		System.out.println(list);
	}
}
