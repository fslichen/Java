package architect.clone.deep;

import lombok.Data;

@Data
public class AnyEntity implements Cloneable {// Don't forget to implement Cloneable.
	private String name;
	private AnotherEntity anotherEntity;
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
		AnyEntity anyEntity = (AnyEntity) super.clone();
		anyEntity.setAnotherEntity((AnotherEntity) anotherEntity.clone());
		return anyEntity;
    }
}
