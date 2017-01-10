package architect.clone.shallow;

public class AnyEntity implements Cloneable {
	private String name;

	@Override
	public String toString() {
		return "AnyEntity [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
