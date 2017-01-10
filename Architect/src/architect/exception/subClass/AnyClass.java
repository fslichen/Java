package architect.exception.subClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class AnyClass {
	public void anyMethod() throws FileNotFoundException {
		InputStream in = new FileInputStream(new File("C:\\"));
	}
}
