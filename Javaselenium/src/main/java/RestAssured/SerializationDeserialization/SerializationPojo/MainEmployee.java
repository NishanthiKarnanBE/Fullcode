package RestAssured.SerializationDeserialization.SerializationPojo;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

public class MainEmployee {

    public static void main(String[] args) throws JsonProcessingException {

        Employee MainEmployee = new Employee();
        MainEmployee.setFirstName("Nishanthi");//assume that values are retrieve from UI to learning purpose, but here we are hardcoding the values
        MainEmployee.setLastName("K");//assume that values are retrieve from UI to learning purpose, but here we are hardcoding the values
        MainEmployee.setEmail("abc@gmail.com");//assume that values are retrieve from UI to learning purpose, but here we are hardcoding the values
        MainEmployee.setSkills(Arrays.asList("Java","Selenium"));//assume that values are retrieve from UI to learning purpose, but here we are hardcoding the values

        System.out.println(MainEmployee.getFirstName());
        System.out.println(MainEmployee.getLastName());
        System.out.println(MainEmployee.getEmail());
        System.out.println(MainEmployee.getSkills());

        //intha java object ah next serialize(java object to json) panna pooro
        //oru map,list ah serialize pandrathu already paathachu
        //here we are going to see How to serialize POJO class(POJO to Json)

        //we are using jackson data bind
        //important one-->object maaper
        ObjectMapper mapper = new ObjectMapper();//Creating object for object mapper
        String jsonstructure = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(MainEmployee);
        //To serialise the POJO class need to use 'writerWithDefauldPrettyPrinter' then we are using 'writeValueAsString' to convert the values to string
        System.out.println(jsonstructure);


    }
}
