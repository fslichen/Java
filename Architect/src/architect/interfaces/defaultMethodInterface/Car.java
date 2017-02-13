package architect.interfaces.defaultMethodInterface;

public class Car implements Vehicle {
	public void move() {
		Vehicle.super.move();
	}
}
