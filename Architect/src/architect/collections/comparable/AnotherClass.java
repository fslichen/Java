package architect.collections.comparable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AnotherClass implements Comparable<AnotherClass> {
	private int age;
	
	public AnotherClass(int age) {
		this.age = age;
	}
	
	public int compareTo(AnotherClass theOtherClass) {// In order to enable the sort functionality, create a compareTo method.
		return this.age - theOtherClass.age;// Ascending Order
	}
}
