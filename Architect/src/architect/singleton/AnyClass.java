package architect.singleton;

public class AnyClass {
	private static AnyClass anyClass;// It belongs to the class.
	static {
		anyClass = new AnyClass();// This is the only object that is created.
	}
	private AnyClass() {// Prevents programmers to create an instance.
		
	}
	public static AnyClass get() {// You are only allowed to get the unique object created in the static block.
		return anyClass;
	}
	public void shout() {
		System.out.println("Yell");
	}
}
