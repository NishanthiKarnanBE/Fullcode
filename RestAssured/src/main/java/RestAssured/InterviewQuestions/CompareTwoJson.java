package RestAssured.InterviewQuestions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CompareTwoJson {

    //Comparing 2 json using jackson library (Object mapper and read tree method)
    //2 json equal means output true
    //2 json not equal means output false
    //2 json order change means output true
    // 2 json array values order change means output false

    static String json1 = "{\n" +
            "  \"name\": \"Nishanthi\",\n" +
            "  \"salary\": \"30500\",\n" +
            "  \"age\": \"23\"\n" +
            "}";
    static String json2 = "{\n" +
            "  \"name\": \"Nishanthi\",\n" +
            "  \"salary\": \"30500\",\n" +
            "  \"age\": \"23\"\n" +
            "}";

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNode1 = objectMapper.readTree(json1);

       JsonNode jsonNode2 = objectMapper.readTree(json2);

        System.out.println(jsonNode1.equals(jsonNode2));

    }
}
