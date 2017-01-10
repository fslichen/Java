package architect.clone.shallow;

public class AnyClass {
	public static void main(String[] args) throws CloneNotSupportedException {
		// Set the data.
		AnyEntity anyEntity = new AnyEntity();
		anyEntity.setName("Chen");
		AnotherEntity anotherEntity = new AnotherEntity();
		anotherEntity.setGender("M");
		TheOtherEntity theOtherEntity = new TheOtherEntity();
		theOtherEntity.setAge(10);
		anotherEntity.setTheOtherEntity(theOtherEntity);
		anyEntity.setAnotherEntity(anotherEntity);
		// Clone
		AnyEntity clonedAnyEntity = (AnyEntity) anyEntity.clone();
		System.out.println(clonedAnyEntity);
		theOtherEntity.setAge(20);// Shallow clone cannot make clonedAnyEntity and external changes to be independent of each other.
		System.out.println(clonedAnyEntity);
	}
}
