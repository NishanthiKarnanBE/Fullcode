package RestAssured.JacksonAnnotations;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.HashMap;
import java.util.Map;

public class JsonanygetterPOJO {

    //In previous POJO class we declare the values as String here we are going to use MAP
    //Here we are going the serialize the MAP

    //While using Map in POJO after serializing the output Josn will be......
    //{employee:{
    //     firstname:"Nisha",
    //     lastname:"K"
    //}}
    //It will take the declared variable name as a 'Key' and given values as 'Values'
    //To avoid this in serializer we are giving JsonAnyGetter annotation in get method of POJO class
    //This annotation will apllicable only for serializer get method

    //When we give JsonAnyGetter annotation in set method...The output will not change..It will display along with variable name as a 'Key'

    private Map<String, Object> employee;

    @JsonAnyGetter
    public Map<String, Object> getEmployee() {
        return employee;
    }

    public void setEmployee(Map<String, Object> employee) {
        this.employee = employee;
    }
}
