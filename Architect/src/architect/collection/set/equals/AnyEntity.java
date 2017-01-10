package architect.collection.set.equals;

import lombok.Data;

@Data
public class AnyEntity {
	private int id;
	
	public AnyEntity(int id) {
		this.id = id;
	}
	
	public int hashCode() {// The equals and hashCode methods always come together.
		return this.id;
	}
	
	public boolean equals(Object anyEntity) {// You have to define the anyEntity as Object, otherwise the complier won't find the method.
		if (this.id == ((AnyEntity)anyEntity).id) {
			return true;
		} else {
			return false;
		}
	}
}
