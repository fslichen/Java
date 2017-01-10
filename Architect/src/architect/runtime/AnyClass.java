package architect.runtime;

public class AnyClass {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		long memory = runtime.freeMemory();
		long maxMemory = runtime.maxMemory();
		System.out.println(memory);
		System.out.println(maxMemory);
		runtime.gc();
	}
}
