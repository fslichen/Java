package architect.clone.deep;

public class AnyEntity implements Cloneable {
	private String name;
	private AnotherEntity anotherEntity;
	
	public AnotherEntity getAnotherEntity() {
		return anotherEntity;
	}

	public void setAnotherEntity(AnotherEntity anotherEntity) {
		this.anotherEntity = anotherEntity;
	}

	@Override
	public String toString() {
		return "AnyEntity [name=" + name + ", anotherEntity=" + anotherEntity + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
		AnyEntity anyEntity = (AnyEntity) super.clone();
		anyEntity.setAnotherEntity((AnotherEntity) anyEntity.getAnotherEntity().clone()); 
        return anyEntity;
    }
}
