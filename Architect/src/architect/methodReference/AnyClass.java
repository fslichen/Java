package architect.methodReference;

public class AnyClass {
	public interface AnyMethod {
		public int doSomething(int a, int b);
	}
	
	public int doSomething(int a, AnyMethod anyMethod, int b) {
		return anyMethod.doSomething(a, b);
	}
	
	public static void main(String [] args) {
		AnyMethod specificMethod = (x, y) -> x + y;
		int c = new AnyClass().doSomething(5, specificMethod, 10);
		System.out.println(c);
	}
}
