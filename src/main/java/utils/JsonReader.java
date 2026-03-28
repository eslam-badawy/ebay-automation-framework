package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;

public class JsonReader {

    public static JsonNode getData() {
        try {
            ObjectMapper mapper = new ObjectMapper();

            InputStream is = JsonReader.class
                    .getClassLoader()
                    .getResourceAsStream("testdata.json");

            if (is == null) {
                throw new RuntimeException("JSON file not found in resources");
            }

            return mapper.readTree(is);

        } catch (Exception e) {
            throw new RuntimeException("Failed to read JSON", e);
        }
    }
}