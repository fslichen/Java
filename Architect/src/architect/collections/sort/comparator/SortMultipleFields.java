package architect.collections.sort.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SortMultipleFields {
	private Integer age;
	private Double salary;
	
	public static void main(String[] args) {
		List<SortMultipleFields> list = new LinkedList<>();
		list.add(new SortMultipleFields(25, 4000d));
		list.add(new SortMultipleFields(26, 5000d));
		list.add(new SortMultipleFields(26, 4000d));
		list.add(new SortMultipleFields(23, 2000d));
		list.add(new SortMultipleFields(23, 3000d));
		Collections.sort(list, new Comparator<SortMultipleFields>() {
			@Override
			public int compare(SortMultipleFields o1, SortMultipleFields o2) {
				int result = o1.getAge().compareTo(o2.getAge());// Ascending Age
				if (result == 0) {
					result = o2.getSalary().compareTo(o1.getSalary());// When ages are the same, compare the salaries in descending manner.
				}
				return result;
			}
		});
		System.out.println(list);
	}
}
