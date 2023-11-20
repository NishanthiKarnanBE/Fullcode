package RestAssured.SerializationDeserialization.DeserializationPojo;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;
import io.restassured.common.mapper.TypeRef;

import java.util.Arrays;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Deserialization {

    String json1 ="{\n" +
            "  \"firstName\" : \"Monisha\",\n" +
            "  \"lastName\" : \"R\",\n" +
            "  \"email\" : \"abcd@gmail.com\",\n" +
            "  \"skills\" : [ \"C\", \"C++\" ]\n" +
            "}";

    //Deserialization using Objectmapper(storing the values in POJO class)
    public void deserializationusingObjectMapper() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();//Creating object for object mapper
        Employee employee =mapper.readValue(json1,Employee.class);//converting the json format and storing it in POJO class
        //Previously in Employee class same values or store now we are convert the json values into java object and store it in Employee class
        System.out.println("New values using object mapper: " +employee.getFirstName());
        System.out.println("New values using object mapper: " +employee.getLastName());
        System.out.println("New values using object mapper: " +employee.getEmail());
        System.out.println("New values using object mapper: " +employee.getSkills());
    }

    //*********************************************************************************************************************//

    String json2 ="{\n" +
            "  \"firstName\" : \"surya\",\n" +
            "  \"lastName\" : \"R\",\n" +
            "  \"email\" : \"abcde@gmail.com\",\n" +
            "  \"skills\" : [ \"C\", \"python\" ]\n" +
            "}";

    //using jayway json, performing deserialization and storing it in POJO class
    public void deserializationUsingJaywayJsonpath(){
        JacksonMappingProvider mappingProvider = new JacksonMappingProvider();//Creating object for jsackson mapping provider..there are so many mapping providers, here we are using jackson mapping provider

        Configuration configuration = Configuration
                .builder()
                .mappingProvider(mappingProvider)///if jacksonmapping provider is not used, it will take default configuration as default
                .build();

        Employee employee =JsonPath//parsing the configuration
                .using(configuration)
                .parse(json2)
                .read("$",Employee.class);//using jsonpath storing the json values in POJO class in the form of java object

        System.out.println("New values using Jayway jsonpath: " +employee.getFirstName());
        System.out.println("New values using Jayway jsonpath: " +employee.getLastName());
        System.out.println("New values using Jayway jsonpath: " +employee.getEmail());
        System.out.println("New values using Jayway jsonpath: " +employee.getSkills());
    }

    //*********************************************************************************************************************//

    String json3 ="{\n" +
            "  \"firstName\" : \"praveen\",\n" +
            "  \"lastName\" : \"S\",\n" +
            "  \"email\" : \"abcdef@gmail.com\",\n" +
            "  \"skills\" : [ \"C\", \"desktop\" ]\n" +
            "}";

    //using rest assured jsonpath, performing deserialization and storing it in POJO class
    public void deserializatinUsingRestAssuredJsonpath(){
        io.restassured.path.json.JsonPath jsonPath = io.restassured.path.json.JsonPath.from(json3);
        Employee employee =jsonPath.getObject("$",Employee.class);//if we give empty string instead of $ same action will be perform(consider entire json)

        System.out.println("New values using RestAssured jsonpath: " +employee.getFirstName());
        System.out.println("New values using RestAssured jsonpath: " +employee.getLastName());
        System.out.println("New values using RestAssured jsonpath: " +employee.getEmail());
        System.out.println("New values using RestAssured jsonpath: " +employee.getSkills());
    }

    //*********************************************************************************************************************//

    //using rest assured 'As' function, performing deserialization and string it in Collectio(Map)
    public void deserializationUsingAsFunction(){
        Map<String,Object> result = given()
                .baseUri("https://dummy.restapiexample.com/api/v1")
                .when()
                .get("/employees")
                .then()
                .extract()
                .body()
                .as(new TypeRef<Map<String,Object>>() {//Typeref is used to store the json value in mentioned generic type(Here we used MAP collection)
                });
        System.out.println(result);
        System.out.println(result.get("status"));
    }

    //*********************************************************************************************************************//

    public static void main(String[] args) throws JsonProcessingException {

        Employee MainEmployee = new Employee();
        MainEmployee.setFirstName("Nishanthi");//assume that values are retrieve from UI to learning purpose, but here we are hardcoding the values
        MainEmployee.setLastName("K");//assume that values are retrieve from UI to learning purpose, but here we are hardcoding the values
        MainEmployee.setEmail("abc@gmail.com");//assume that values are retrieve from UI to learning purpose, but here we are hardcoding the values
        MainEmployee.setSkills(Arrays.asList("Java","Selenium"));//assume that values are retrieve from UI to learning purpose, but here we are hardcoding the values

        System.out.println("Existing values: " +MainEmployee.getFirstName());
        System.out.println("Existing values: " +MainEmployee.getLastName());
        System.out.println("Existing values: " +MainEmployee.getEmail());
        System.out.println("Existing values: " +MainEmployee.getSkills());

        System.out.println("***********************************");
        Deserialization deserialization = new Deserialization();
        deserialization.deserializationusingObjectMapper();

        System.out.println("***********************************");
        deserialization.deserializationUsingJaywayJsonpath();

        System.out.println("***********************************");
        deserialization.deserializatinUsingRestAssuredJsonpath();

        System.out.println("***********************************");
        deserialization.deserializationUsingAsFunction();
    }
}
