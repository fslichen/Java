package architect.nested.interfacz;

public interface AnyInterface {
	public interface AnotherInterface {// Static by Default
		public void anyMethod();
	}
	
	public class AnyClass {// Static by Default
		
	}
}
