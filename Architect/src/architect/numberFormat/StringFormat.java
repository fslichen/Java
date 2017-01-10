package architect.numberFormat;

public class StringFormat {
	public static void main(String[] args) {
		String str = String.format("%.0f", 43.6);// you don't have to go like float.valueof and then math round.
		System.out.println(str);
	}
}
