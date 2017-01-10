package architect.generic.nested;

import org.junit.Test;

public class AnyClass extends AnyAbstractClass<AnyEntity<Integer>, Integer> { 
	@Test
	public void test() {
		AnyEntity<Integer> anyEntity = new AnyEntity<>();
		anyEntity.setValue(3);
		anyMethod(anyEntity);
	}
}
