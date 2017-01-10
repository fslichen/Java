package architect.string.create;

public class AnyClass {
	public static void main(String[] args) {
		String str1 = "welcome";
		String str2 = "welcome";
		if (str1.equals(str2)) {
			System.out.println("str1 and str2 are the same objects. Only one object is created.");
		}
		String str3 = new String("welcome");
		String str4 = new String("welcome");
		if (str3.equals(str4)) {
			System.out.println("str3 and str4 are the different objects");
		}
	}
}
