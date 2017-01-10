package architect.abstractClass;

public abstract class AnyAbstractClass {
	public abstract String getName();

	public void introduce() {
		System.out.println("My name is " + this.getName());
	}
}
