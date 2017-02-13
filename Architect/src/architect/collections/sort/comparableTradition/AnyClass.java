package architect.collections.sort.comparableTradition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AnyClass implements Comparable<AnyClass> {
	private int age;
	
	public AnyClass(int age) {
		this.age = age;
	}
	
	public int compareTo(AnyClass theOtherClass) {// In order to enable the sort functionality, create a compareTo method.
		return this.age - theOtherClass.age;// Ascending Order
	}
	
	public static void main(String[] args) {
		List<AnyClass> anotherClasses = new ArrayList<>();
		anotherClasses.add(new AnyClass(5));
		anotherClasses.add(new AnyClass(2));
		anotherClasses.add(new AnyClass(7));
		Collections.sort(anotherClasses);
		System.out.println(anotherClasses);
	}
}
