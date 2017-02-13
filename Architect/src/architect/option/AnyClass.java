package architect.option;

import java.util.Optional;

public class AnyClass {
	public static void main(String[] args) {
		Optional<Integer> optional = Optional.ofNullable(null);// Allow null value and treat it as absent.
		if (optional.isPresent()) {
			System.out.println(optional.get());
		} else {
			System.out.println("The value is null.");
		}
		optional = Optional.of(3);
		if (optional.isPresent()) {
			System.out.println(optional.get());
		}
	}
}
