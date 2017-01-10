package architect.clone.shallow;

import lombok.Data;

@Data
public class AnyEntity implements Cloneable {// Don't forget to implement Cloneable.
	private String name;
	private AnotherEntity anotherEntity;
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
