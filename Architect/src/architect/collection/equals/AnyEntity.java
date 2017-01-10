package architect.collection.equals;

public class AnyEntity {
	private int id;
	
	public int hashCode() {
		return this.id;
	}
	
	public AnyEntity(int id) {
		this.id = id;
	}
	
	// You have to define the anyEntity as Object, otherwise the complier won't find the method.
	public boolean equals(Object anyEntity) {
		if (this.id == ((AnyEntity)anyEntity).id) {
			return true;
		} else {
			return false;
		}
	}
}
