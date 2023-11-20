package RestAssured.SerializationDeserialization;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Serialization {

    @Test
    public void serialization(){
        Map<String,Object> jsonobject = new HashMap<String,Object>();
        List<String> skills = new ArrayList<>();
        skills.add("Java");
        skills.add("selenium");
        skills.add("cucumber");

                jsonobject.put("name","Nishanthi");
                jsonobject.put("salary","28500");
                jsonobject.put("age","23");
                jsonobject.put("skills",skills);

        System.out.println(jsonobject);

        //libraries that help to convert java objects to json format
        //libraries names are   jackson(databind), Gson, johnzon,   yasson
        //created java object in above code using MAP and LIST
        //going to post the java object by using rest assured in below code

        RestAssured
                .given()
                    .baseUri("https://dummy.restapiexample.com/api/v1")
                    .header("Content-Type","application/json")
                    .body(jsonobject)
                    .log()   // print what is happening in request
                    .all()
                .when()
                    .post("/create")
                .then()
                    .log()
                    .all();
    }
    //For me, jsonobject is converted to json..if it is not, add jackson-databind library in pom.xml
}
