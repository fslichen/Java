package architect.exception.rethrow;

public class AnyClass {
	public static void main(String[] args) throws Exception {
		try {
			double x = 1 / 0;
		} catch (Exception e) {
			if (1 == 1) {
				throw new Exception();
			}
		}
	}
}
