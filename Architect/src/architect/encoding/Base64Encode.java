package architect.encoding;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Encode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String base64encodedString = Base64.getEncoder().encodeToString("Chen".getBytes("utf-8"));
        System.out.println("Base64 Encoded String (Basic) :" + base64encodedString);
        // Decode
        byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
        for (int i = 0; i < base64decodedBytes.length; i++) {
        	System.out.println(base64decodedBytes[i]);// ASCII Code
        }
	}
}
