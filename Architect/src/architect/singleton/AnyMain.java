package architect.singleton;

public class AnyMain {
	public static void main(String[] args) {
		AnyClass anyClass = AnyClass.get();
		anyClass.shout();
	}
}	
