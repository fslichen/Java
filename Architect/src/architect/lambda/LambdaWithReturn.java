package architect.lambda;

public class LambdaWithReturn {
	public interface Operation {
		int compare(int a, int b);
	}
	
	public int compare(int a, Operation operation, int b) {
		return operation.compare(a, b);
	}
	
	public static void main(String[] args) {
		Operation min = (int a, int b) -> {
			return a < b ? a : b;
		};
		Operation max = (int a, int b) -> {
			return a > b ? a : b;
		};
		LambdaWithReturn ifStatement = new LambdaWithReturn();
		System.out.println(ifStatement.compare(2, min, 3));
		System.out.println(ifStatement.compare(2, max, 3));
	}
}
