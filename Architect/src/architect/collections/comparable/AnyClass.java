package architect.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnyClass {
	public static void main(String[] args) {
		List<AnotherClass> anotherClasses = new ArrayList<>();
		anotherClasses.add(new AnotherClass().setAge(5));
		anotherClasses.add(new AnotherClass().setAge(2));
		anotherClasses.add(new AnotherClass().setAge(7));
		Collections.sort(anotherClasses);
		System.out.println(anotherClasses);
	}
}
