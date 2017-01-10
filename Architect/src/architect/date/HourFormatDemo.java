package architect.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HourFormatDemo {
	public static void main(String[] args) {
		SimpleDateFormat sdf0 = new SimpleDateFormat("HH:mm:ss");// 24h Format
		System.out.println(sdf0.format(new Date()));
		SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss");// 12h Format
		System.out.println(sdf1.format(new Date()));
	}
}
