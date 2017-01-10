package architect.clone.deep;

import lombok.Data;

@Data
public class AnotherEntity implements Cloneable {// Don't forget to implement Cloneable.
	private String gender;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
