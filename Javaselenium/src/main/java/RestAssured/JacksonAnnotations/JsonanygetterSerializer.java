package RestAssured.JacksonAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class JsonanygetterSerializer {

    public static void main(String[] args) throws JsonProcessingException {
        JsonanygetterPOJO jsonanygetterPOJO = new JsonanygetterPOJO();

        Map<String,Object> mapValues =new HashMap<String,Object>();//Creating object for Map to set the values

        mapValues.put("FirstName", "Nishanthi");
        mapValues.put("LastName","K");
        mapValues.put("Email","abc@gmail.com");
        mapValues.put("Skills", Arrays.asList("Java","Selenium"));

        jsonanygetterPOJO.setEmployee(mapValues);

        ObjectMapper objectMapper = new ObjectMapper();
        String Json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonanygetterPOJO);
        System.out.println(Json);
    }
}
