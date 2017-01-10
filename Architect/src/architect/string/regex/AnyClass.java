package architect.string.regex;

public class AnyClass {
	public static void main(String[] args) {
		String string = "Hello World";
		String newString = string.replaceAll("\\s", "");
		System.out.println(newString);
	}
}
