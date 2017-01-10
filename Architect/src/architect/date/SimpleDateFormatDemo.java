package architect.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
		String string = sdf.format(new Date());
		System.out.println(string);
		Date date = sdf.parse("2016-10-09T10:09:32+08:00");
		System.out.println(date);
	}
}
