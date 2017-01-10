package architect.generic.nested;

public class AnyAbstractClass<T extends AnyEntity<V>, V> {
	public void anyMethod(AnyEntity<V> anyEntity) {
		System.out.println(anyEntity.toString());
	}
}
