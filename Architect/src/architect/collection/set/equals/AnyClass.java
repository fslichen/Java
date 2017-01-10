package architect.collection.set.equals;

import java.util.LinkedHashSet;
import java.util.Set;

public class AnyClass {
	public static void main(String[] args) {
		AnyEntity anyEntity0 = new AnyEntity(0);
		AnyEntity anyEntity1 = new AnyEntity(0);
		Set<AnyEntity> anyEntities = new LinkedHashSet<>();
		anyEntities.add(anyEntity0);
		anyEntities.add(anyEntity1);
		System.out.println(anyEntities);
	}
}
