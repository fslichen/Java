package architect.hashcode;

public class AnyClass {
	public static void main(String[] args) {
		// You should be able to see that these two strings have the same hash codes. 
		String string0 = "anyString";
		System.out.println(string0.hashCode());
		String string1 = "anyString";
		System.out.println(string1.hashCode());
		String string2 = new String("anyString");
		System.out.println(string2.hashCode());
		String string3 = new String("anyString");
		System.out.println(string3.hashCode());
	}
}
