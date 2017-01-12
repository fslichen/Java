package architect.reflect;

public class GetMethodNameInRunTimeDemo {
	public void anyMethod() {
		String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(methodName);
	}
	
	public static void main(String[] args) {
		GetMethodNameInRunTimeDemo demo = new GetMethodNameInRunTimeDemo();
		demo.anyMethod();
	}
}
