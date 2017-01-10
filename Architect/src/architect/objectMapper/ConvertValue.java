package architect.objectMapper;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertValue {
	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, String> map = new HashMap<>();
		map.put("name", "Chen");
		// Previously, you used lots of readValue() and writeValue(), but the convertValue() might be more useful.  
		// The convertValue() method converts one object to another object. 
		AnyEntity anyEntity = objectMapper.convertValue(map, AnyEntity.class);
		System.out.println(anyEntity);
	}
}
