package architect.collections.sort.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StandAloneComparator {
	private Integer age;
	private Double salary;
	
	public static void main(String[] args) {
		List<StandAloneComparator> list = new LinkedList<>();
		list.add(new StandAloneComparator(25, 80d));
		list.add(new StandAloneComparator(26, 40d));
		list.add(new StandAloneComparator(26, 30d));
		list.add(new StandAloneComparator(25, 45d));
		Comparator<StandAloneComparator> comparator = Comparator.comparing(StandAloneComparator::getAge).reversed()
		.thenComparingDouble(StandAloneComparator::getSalary);// Descending age and Ascending Salary
		Collections.sort(list, comparator);
		System.out.println(list);
	}
}
