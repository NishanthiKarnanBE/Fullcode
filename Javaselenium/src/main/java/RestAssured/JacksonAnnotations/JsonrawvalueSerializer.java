package RestAssured.JacksonAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonrawvalueSerializer {

    public static void main(String[] args) throws JsonProcessingException {

        JsonrawvaluePOJO jsonrawvaluePOJO = new JsonrawvaluePOJO();

        jsonrawvaluePOJO.setId(1);
        jsonrawvaluePOJO.setName("Nisha");
        jsonrawvaluePOJO.setEmail("abc@gmail.com");

        ObjectMapper objectMapper = new ObjectMapper();
        String Json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonrawvaluePOJO);
        System.out.println(Json);

    }
}
