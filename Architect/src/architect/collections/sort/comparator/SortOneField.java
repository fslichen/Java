package architect.collections.sort.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SortOneField {
	private Double salary;
	
	public static void main(String[] args) {
		List<SortOneField> list = new LinkedList<>();
		list.add(new SortOneField(23d));
		list.add(new SortOneField(46d));
		list.add(new SortOneField(24d));
		list.add(new SortOneField(54d));
		Collections.sort(list, new Comparator<SortOneField>() {// One good thing about the comparator is that it doesn't modify the original class.
			@Override
			public int compare(SortOneField anyClass0, SortOneField anyClass1) {
				return anyClass0.getSalary().compareTo(anyClass1.getSalary());// Ascending Order
			}
		});
		System.out.println(list);
	}
}
