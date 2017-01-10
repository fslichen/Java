package architect.clone.deep;

public class AnyClass {
	public static void main(String[] args) throws CloneNotSupportedException {
		AnyEntity anyEntity = new AnyEntity();
		anyEntity.setName("Chen");
		AnotherEntity anotherEntity = new AnotherEntity();
		anotherEntity.setGender("M");
		anyEntity.setAnotherEntity(anotherEntity);
		AnyEntity clonedEntity = (AnyEntity) anyEntity.clone();
		anotherEntity.setGender("F");
		System.out.println(clonedEntity);
		System.out.println(anotherEntity);
	}
}
