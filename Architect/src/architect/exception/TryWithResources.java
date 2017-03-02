package architect.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	// A resource is an object that must be closed after the program is finished with it.
	// Any object that implements java.lang.AutoCloseable can be used as a resource.
	public static String readLine(String path) throws FileNotFoundException, IOException {
		try (BufferedReader bufferedReader =
                new BufferedReader(new FileReader(path))) {
			return bufferedReader.readLine();
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		readLine("/home/chen/data");
	}
}
