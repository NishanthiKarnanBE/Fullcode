package RestAssured.JacksonAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsongetterSerializer {

    public static void main(String[] args) throws JsonProcessingException {

    JsongetterPOJO jsongetterPOJO = new JsongetterPOJO();

    jsongetterPOJO.setId(1);
    jsongetterPOJO.setName("Nisha");
    jsongetterPOJO.setEmail("abc@gmail.com");

    ObjectMapper objectMapper = new ObjectMapper();
    String Json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsongetterPOJO);
    System.out.println(Json);

}
}
