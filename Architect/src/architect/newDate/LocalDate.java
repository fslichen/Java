package architect.newDate;

import java.time.LocalDateTime;
public class LocalDate {
	public static void main(String[] args) {// Now, Date has become a legacy class.
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.toLocalDate());
		System.out.println(ldt.getMonthValue());
		System.out.println(ldt.getDayOfMonth());
	}
}
