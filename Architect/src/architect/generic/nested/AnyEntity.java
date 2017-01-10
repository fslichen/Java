package architect.generic.nested;

public class AnyEntity<V> {
	V value;
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "AnyEntity [value=" + value + "]";
	}
}
