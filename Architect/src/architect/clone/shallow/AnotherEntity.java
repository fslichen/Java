package architect.clone.shallow;

import lombok.Data;

@Data
public class AnotherEntity implements Cloneable {// Don't forget to implement Cloneable.
	private String gender;
	private TheOtherEntity theOtherEntity;
}
