package architect.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryOnly {
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
