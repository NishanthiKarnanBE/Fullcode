package RestAssured.JacksonAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonvalueSerializer {

    public static void main(String[] args) throws JsonProcessingException {

        JsonvaluePOJO jsonvaluePOJO = new JsonvaluePOJO();

        jsonvaluePOJO.setId(1);
        jsonvaluePOJO.setName("Nisha");
        jsonvaluePOJO.setEmail("abc@gmail.com");

        ObjectMapper objectMapper = new ObjectMapper();
        String Json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonvaluePOJO);
        System.out.println(Json);

    }
}
