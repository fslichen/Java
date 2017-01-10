package architect.string.cLike;

import java.util.Arrays;

public class AnyClass {
	public static void main(String[] args) {
		System.out.println(String.format("Hello %s", "Elsa"));// %s represents a string.
		System.out.println(String.format("Hello %d", 10));// %d represents an int, this is just like what happens in C.
		System.out.println(String.format("Hello %f", 10d));// %f represents a floating number, this is just like what happens in C.
		System.out.println("df" + null);
		System.out.println("8923".split(",")[0]);
	}
}
