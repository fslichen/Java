package architect.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AnyClass {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
		String str = simpleDateFormat.format(new Date());
		System.out.println(str);
		Date dat = simpleDateFormat.parse("2016-10-09T10:09:32+08:00");
		System.out.println(dat);
	}
}
