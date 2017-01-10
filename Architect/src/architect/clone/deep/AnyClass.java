package architect.clone.deep;

public class AnyClass {
	public static void main(String[] args) throws CloneNotSupportedException {
		// Set the data.
		AnyEntity anyEntity = new AnyEntity();
		anyEntity.setName("Chen");
		AnotherEntity anotherEntity = new AnotherEntity();
		anotherEntity.setGender("M");
		anyEntity.setAnotherEntity(anotherEntity);
		// Clone
		AnyEntity clonedAnyEntity = (AnyEntity) anyEntity.clone();
		System.out.println(clonedAnyEntity);
		anotherEntity.setGender("F");// Deep clone can make clonedAnyEntity and external changes to be independent of each other.
		System.out.println(clonedAnyEntity);
	}
}
