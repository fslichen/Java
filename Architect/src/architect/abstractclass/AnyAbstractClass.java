package architect.abstractclass;

public abstract class AnyAbstractClass {
	public abstract void anyMethod();
	public void anotherMethod() {
		// This does not represent the abstract class, 
		// but the class than extend from the abstract class.
		this.anyMethod();
	}
}
