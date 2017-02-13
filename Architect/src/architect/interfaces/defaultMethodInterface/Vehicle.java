package architect.interfaces.defaultMethodInterface;

public interface Vehicle {
	// You are allowed to give a method in an interface right now.
	// The method is by default static, but don't give a static keyword.
	// It provides the backward compatibility.
	default void move() {
		System.out.println("The vehicle is moving.");
	}
}
