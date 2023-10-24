package RestAssured.JacksonAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonpropertyorderSerializer {

    public static void main(String[] args) throws JsonProcessingException {

        JsonpropertyorderPOJO jsonpropertyorderPOJO = new JsonpropertyorderPOJO();

        jsonpropertyorderPOJO.setId(1);
        jsonpropertyorderPOJO.setName("Nisha");
        jsonpropertyorderPOJO.setEmail("abc@gmail.com");

        ObjectMapper objectMapper = new ObjectMapper();
        String Json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonpropertyorderPOJO);
        System.out.println(Json);

    }
}
