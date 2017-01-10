package architect.clone.shallow;

public class AnyClass {
	public static void main(String[] args) throws CloneNotSupportedException {
		AnyEntity anyEntity = new AnyEntity();
		anyEntity.setName("Chen");
		AnyEntity anotherEntity = (AnyEntity) anyEntity.clone();
		System.out.println(anotherEntity);
	}
}
