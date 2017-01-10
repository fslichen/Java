package architect.objectMapper;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadValue {
	public static void main() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		// When you are using readValue(), you often just read from a string, an inputstream and put it inside a certain object.
		// readValue() and writeValue() usually dues with the io kinds of issus. 
		AnyEntity anyEntity = objectMapper.readValue("{\"name\" : \"Chen\"}", AnyEntity.class);
		System.out.println(anyEntity);
	}
}
