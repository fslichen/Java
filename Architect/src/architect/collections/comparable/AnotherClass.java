package architect.collections.comparable;

public class AnotherClass implements Comparable<AnotherClass> {
	private int age;
	@Override
	public int compareTo(AnotherClass theOtherClass) {
		// Ascending Order
		return this.age - theOtherClass.age;
	}
	public int getAge() {
		return age;
	}
	public AnotherClass setAge(int age) {
		this.age = age;
		return this;
	}
	@Override
	public String toString() {
		return "AnotherClass [age=" + age + "]";
	}
}
