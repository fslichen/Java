package architect.objectMapper;

public class AnyEntity {
	String name;

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "AnyEntity [name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
}
