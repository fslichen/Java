package architect.bigDecimal;

import java.math.BigDecimal;

public class Imprecise {
	public static void main(String[] args) {
		BigDecimal x = new BigDecimal(0.1);
		x.add(new BigDecimal(0.2));
		System.out.println(x);
	}
}
