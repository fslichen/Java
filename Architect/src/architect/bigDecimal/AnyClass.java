package architect.bigDecimal;

import java.math.BigDecimal;

public class AnyClass {
	public static void main(String[] args) {
		BigDecimal x = new BigDecimal(0.0);
		x = x.add(new BigDecimal(5.0));
		x = x.add(new BigDecimal(6.0));
		x = x.add(new BigDecimal(7.0));
		x = x.add(new BigDecimal(8.0));
		System.out.println(x);
		BigDecimal[] bigDecimals = new BigDecimal[23];
		
	}
}
