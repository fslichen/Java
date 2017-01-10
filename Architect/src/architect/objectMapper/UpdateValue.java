package architect.objectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class UpdateValue {
	public static void main(String[] args) throws JsonProcessingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, String> originalValue = new HashMap<>();
		originalValue.put("name", "Chen");
		Map<String, String> updatedValue = new HashMap<>();
		updatedValue.put("gender", "M");
		// This method merges the original value and the updated value.
		ObjectReader objectReader = objectMapper.readerForUpdating(updatedValue);
		String jsonForOriginalValue = objectMapper.writeValueAsString(originalValue);
		Object object = objectReader.readValue(jsonForOriginalValue);
		System.out.println(object);
	}
}
